package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import Justrechargeittest.WebDriverManger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class justrechargeit {

	public static void main(String[] args) {
		// open the URL http://www. justrechargeit.com/Signin.aspx
	
		//Type invalid data into all fields (email, password, Captcha..)
		
        //click on Signin button
		
		//create an object for Selenium interface 
		//CLASSNAME referenceName = new CLASSNAME();
		WebDriver driver; 
		
		// Open chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//type URL
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		//type invalid data into ("email")
		driver.findElement(By.id("txtUserName")).sendKeys("keya");
		//type invalid data into ("Password")
		driver.findElement(By.id("txtPasswd")).sendKeys("keya");
		//type invalid data into ("Captcha")
		driver.findElement(By.id("txtCaptcha")).sendKeys("23");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		
		
		
		
		
		
	}	

}
