import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestNG {
	ChromeDriver driver = new ChromeDriver();
  @Test
  public void f() { 
	  driver.manage().window().maximize();
	  
      driver.get("https://www.automationanywhere.com/");
      System.out.println("Page navigated: " + driver.getTitle());
  }
  @Test(priority=0)
  public void logo(){
      WebElement element = driver.findElement(By.xpath("//a[@class='coh-link header-logo']"));
      System.out.println("logo is present");
  }
  @Test(timeOut = 500)
	public void timeout() throws InterruptedException {          //Fails
		Thread.sleep(1000);
		 WebElement Element = driver.findElement(By.linkText("Request Demo"));
		System.out.println("Not found");
	}
  @Test(priority=1)
  public void productlogo() {
      driver.findElement(By.id("onetrust-accept-btn-handler")).click();
      WebElement link1 = driver.findElement(By.linkText("Products"));
      link1.click();
      System.out.println("Page navigated: " +driver.findElement(By.xpath("//p[text()='The Automation Success Platform']")).isDisplayed());
  }
  @Test(enabled=false)
  public void Solutionslogo() {
	  WebElement link2 = driver.findElement(By.linkText("Solutions"));
      link2.click();
      System.out.println("Page navigated: " +driver.findElement(By.xpath("//h1[text()=' Automation Anywhere Solutions ']")).isDisplayed());
  }
}
