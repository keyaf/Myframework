import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {

	private static final char[] AlertText = null;

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		//create new account
		//driver.findelement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.xpath("fnShowContent('errorCode','english')"));
		Thread.sleep(3000);
		//Without fill any data, do click on login button
		driver.findElement(By.id("Button2")).click();
	    Thread.sleep(3000);
	    //get the alert text
	    String alertText = driver.switchTo().alert().getText();
	    System.out.println(AlertText);
	    //Click on ok button on alert
	    driver.switchTo().alert().accept();
	    
		
				
				

	}
	

}
