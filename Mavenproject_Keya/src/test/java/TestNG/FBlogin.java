package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBlogin {
  @Test
  public void f() {
	  
	  
	    WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("keya.f@aol.com");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		
		
  }
}
