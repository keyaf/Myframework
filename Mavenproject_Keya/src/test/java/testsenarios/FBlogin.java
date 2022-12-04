package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBlogin {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		//Type URL
		driver.get("https://www.facebook.com/");
		//Type UN & PWD 
		driver.findElement(By.id("email")).sendKeys("keya.f@aol.com");
		driver.findElement(By.name("pass")).sendKeys("pass");
		//Click on login button
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
