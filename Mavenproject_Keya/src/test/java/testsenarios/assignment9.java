package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment9 {

	public static void main(String[] args) {
	        WebDriver driver ;
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    
        //https://www.justrechargeit.com/SignIn.aspx
		    driver.get("https://www.justrechargeit.com/SignIn.aspx");
		//Login with valid details
		    driver.findElement(By.id("myprofile"));
		 //Click on Delete icon of any row
		    driver.findElements(By.id("directory"));
		//Confirmation Alert will display, 
		    driver.findElements(By.id("jrialerts"));
		//Get the text and do any action on top of Confirmation Alert OK/CANCEL
		    driver.findElement(By.id("directory"));
		    
		    
	}

}
