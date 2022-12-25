

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Ecommerce.Utils.Readdataproperties;

public class FacebookLogin extends FaccbookLoginLocators{

	

	
		 
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.xpath(Username)).sendKeys("r1");
		
			
		
		
			
		}	
	
			}
	


