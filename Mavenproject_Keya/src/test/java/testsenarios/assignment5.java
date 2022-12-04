package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment5 {

	public static void main(String[] args) throws Exception {
		WebDriver driver ;
		WebDriverManager. chromedriver() . setup();
	    driver = new ChromeDriver();
	    
	    
		//Go to URL https://www.justrechargeit.com/
	    driver.get("https://www.justrechargeit.com/");
	    
		//Click on CreateNewAccount hyper link
		driver.findElement(By.linkText("Create New Account")).click();
		//Type NAme edit box (any dummy data)
		driver.findElement(By.id("signin")).sendKeys("keya");
		//Click on Refresh iconwait for few second
		Thread.sleep(9000);

		// click on Back icon
		driver.navigate().back();
		//wait for few second
		driver.navigate().back();
		//click on Forward icon
		driver.navigate().forward();

	}

}
