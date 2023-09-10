package MOHANA_Maven.MOHANA_Maven;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Seleniumtest2 {

	public static void main(String[] args) {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Donato\\Desktop\\assignmentworkspace\\MOHANA-Maven\\src\\main\\resources\\Drivers\\chromedriver.exe");
	  
	        ChromeDriver driver = new ChromeDriver();
	  
	        driver.manage().window().maximize();
	  
	        driver.get("https://www.automationanywhere.com/");
	        System.out.println("Page navigated: " + driver.getTitle());
	        WebElement element = driver.findElement(By.xpath("//a[@class='coh-link header-logo']"));
	        System.out.println("logo is present");
	        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	        WebElement link1 = driver.findElement(By.linkText("Products"));
	        link1.click();
	        System.out.println("Page navigated: " +driver.findElement(By.xpath("//p[text()='The Automation Success Platform']")).isDisplayed());
	        WebElement link2 = driver.findElement(By.linkText("Solutions"));
	        link2.click();
	        System.out.println("Page navigated: " +driver.findElement(By.xpath("//h1[text()=' Automation Anywhere Solutions ']")).isDisplayed());
	        WebElement link3 = driver.findElement(By.linkText("Resources"));
	        link3.click();
	        System.out.println("Page navigated: " +driver.findElement(By.xpath("//h1[text()=' Intelligent Automation Resources ']")).isDisplayed());
	        WebElement link4 = driver.findElement(By.linkText("Beyond RPA"));
	        link4.click();
	        System.out.println("Page navigated: " +driver.findElement(By.xpath("//h1[text()='Robotic Process Automation (RPA)']")).isDisplayed());
	        WebElement link5 = driver.findElement(By.linkText("Company"));
	        link5.click();
	        System.out.println("Page navigated: " +driver.findElement(By.xpath("//h1[text()='About Automation Anywhere']")).isDisplayed());
	    }

	}


