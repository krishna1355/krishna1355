import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Keywordevents {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	
	String baseUrl = "http://www.facebook.com/"; 
	

	driver.get(baseUrl);
	WebElement txtUsername = driver.findElement(By.id("email"));

	Actions builder = new Actions(driver);
	Action seriesOfActions = (Action) builder
		.moveToElement(txtUsername)
		.click()
		.keyDown(txtUsername, Keys.SHIFT)
		.sendKeys(txtUsername, "hello")
		.keyUp(txtUsername, Keys.SHIFT)
		.doubleClick(txtUsername)
		.contextClick()
		.build();
		
	((org.openqa.selenium.interactions.Action) seriesOfActions).perform() ;

}
}
