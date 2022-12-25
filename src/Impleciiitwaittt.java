import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Impleciiitwaittt {
WebDriver driver;

	

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
	 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
	driver.get("http://www.google.com");
WebElement	element = driver.findElement(By.id("lst-ib"));
	element.sendKeys("Selenium WebDriver Interview questions");
	element.sendKeys(Keys.RETURN);
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception {
	//driver.quit();
	}
}
