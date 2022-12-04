package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7_1 {

	public static void main(String[] args) throws Exception {
		//public static void main(String[] args) throws Exception {
		WebDriver driver ;
		WebDriverManager. chromedriver() . setup();
	    driver = new ChromeDriver();
	
				//https://tesomationpractice.blogspot.com/
				 driver.get("https://testautomationpractice.blogspot.com/");
				//Select a speed: Fast
				driver.findElement(By.name("speed"));
				//Select a file: PDF file
				 driver.findElements(By.xpath("file_upload_files"));
				//Select a number: 4
				 driver.findElement(By.name("number"));
				//Select a Product: Iphone
				 driver.findElements(By.name("products"));
				//Select a Animal: Baby cat
				 driver.findElements(By.name("animals"));
				 

	}

}
