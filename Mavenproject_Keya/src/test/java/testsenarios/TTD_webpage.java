package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTD_webpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		//wait statement
		Thread.sleep(3000);
		//Click on IOS app download icon
		driver.findElement(By.xpath("content/img/app-store.png"));
		

	}

}
