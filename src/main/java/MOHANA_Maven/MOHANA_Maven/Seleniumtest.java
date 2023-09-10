package MOHANA_Maven.MOHANA_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Seleniumtest {

	public static void main(String[] args) {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Donato\\Desktop\\assignmentworkspace\\MOHANA-Maven\\src\\main\\resources\\Drivers\\chromedriver.exe");
	  
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.automationanywhere.com/");
	        
	        WebElement element = driver.findElement(By.xpath("//a[@class='coh-link header-logo']"));
	        System.out.println("logo is present");
	        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//	        WebElement Element = driver.findElement(By.linkText("Request Demo"));
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        WebDriverWait wait=new 	WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Request Demo")));
	        System.out.println("element not clickable");
//	        //driver.findElement(By.linkText("Request Demo")).click();
	        WebElement link1 = driver.findElement(By.linkText("Products"));
	        link1.click();
	        System.out.println("Page navigated: " + driver.getTitle());
	    }

	}


