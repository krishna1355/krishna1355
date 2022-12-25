import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expectwaittt {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
	driver=new ChromeDriver();
	// launching gmail.com on the browser
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1946522969%3A1671434389046023&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
	// maximized the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
	// saving the GUI element reference into a "element" variable of WebElement type
	WebElement element = driver.findElement(By.xpath("//input[@type='email']"));

	element.sendKeys("madhusudhanreddy081@gmail.com");
	element.sendKeys(Keys.RETURN);
//	driver.findElement(By.xpath("//span[text()='Next']")).click();
	// entering password
	driver.findElement(By.id("Passwd")).sendKeys("1516137080");
	// clicking signin button
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	// explicit wait - to wait for the compose button to be click-able
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

	@AfterMethod
	public void teardown() {
	// closes all the browser windows opened by web driver
	driver.quit();
	}
}
