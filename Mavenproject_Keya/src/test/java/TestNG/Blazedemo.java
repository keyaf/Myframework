package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Blazedemo {
	WebDriver driver;

	@Test
	// Choose your departure city:
	// Choose your destination city:
	// Click on FindFlights button
	public void a() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		new Select(driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.xpath("//select[@name='toPort']"))).selectByVisibleText("London");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(5000);
	}

	@Test

//Click on 'Choose This Flight' (any button / third one)

	public void b() throws Exception {
		driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();
		Thread.sleep(5000);
	}

	@Test

//Fill all the data(Valid/Invalid) then click on 'Purchase' Flight button
	public void c() throws Exception {
		driver.findElement(By.xpath("//*[@id='inputName']")).sendKeys("Keya");
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys("121 main street");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Commack");
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys("11784");
		new Select(driver.findElement(By.xpath("//*[@id='cardType']"))).selectByVisibleText("Visa");
		driver.findElement(By.xpath("//*[@id='creditCardNumber']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='creditCardMonth']")).sendKeys("11");
		driver.findElement(By.xpath("//*[@id='creditCardYear']")).sendKeys("2022");
		driver.findElement(By.xpath("//*[@id='nameOnCard']")).sendKeys("Keya");
		driver.findElement(By.xpath("//*[@value='Purchase Flight']")).click();
		Thread.sleep(9000);
	}

	@Test
//Get the message "Thank you for your purchase today!"
	public void d() {
		System.out.println(driver.findElement(By.tagName("h1")).getText());
	}

	@Test
//Get all the other details
	public void e() {
		driver.findElement(By.xpath("//*[@class='container hero-unit']")).getText();

	}
}
