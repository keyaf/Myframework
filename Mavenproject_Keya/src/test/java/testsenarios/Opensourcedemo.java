package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opensourcedemo {

	public static void main(String[] args) throws Exception {
		//Create an object for webDriver interface 
		//CLASSNAME referenceName = new CLASSNAME ();
        WebDriver driver;
		
		//Open chrome browser
		WebDriverManager.chromedriver() .setup();
		driver = new ChromeDriver();
		
		//type URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(9000);
		
		
	    //type username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//type password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Click on login button
		driver.findElement(By.tagName("login")).click();
		
		
		
	}

}
