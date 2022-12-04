package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7_3 {

	public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	
    //https://tirupatibalaji.ap.gov.in/#/registration
	 driver.get("https://tirupatibalaji.ap.gov.in/#/registration");

     //Choose Country as "INDIA"
	 new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");
		 
      //State as "Assam" / Goa /your wish
	 driver.findElement(By.id("state")).getDomAttribute("Goa");



	}

}
