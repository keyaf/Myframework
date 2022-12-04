package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assingment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// TODO Auto-generated method stubOpen URL https://myaccount.greenmountain.com/en_US/register
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		//Click on "Contact Us" link
		driver.findElements(By.xpath("</div/html/body/div[3]/div/div/div/div/div[3]/div[2]"));
		//Close the currentwindow
		Thread.sleep(6000);
		//Quit the all windows
		driver.quit();
		

	}

}
