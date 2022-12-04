package Justrechargeittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManger {

	public static void main(String[] args) {
		// Go to URL https://www.justrechargeit.com/
		//Click on CreateNewAccount hyper link
		//Type NAme edit box (any dummy data)
		//Click on Refresh icon
		//wait for few second
		//then, click on Back icon
		//wait for few second
		//then, click on Forward icon

		//create an object for selenium interface
		// CLASSNAME referanceName = New CLASSNAME ();
		WebDriver driver;
		
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//go to URL
		driver.get("https://www.justrechargeit.com/");
		//Click on CreateNewAccount 
		driver.findElement(By.className("hyperLink")).click();
		//type name edit box
		driver.findElement(By.id("kamrun"));
	
	
		
		
		
		
	}

}
