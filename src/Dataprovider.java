import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver = null;
	@BeforeMethod
	public void browserlanch() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://pixabay.com/accounts/login/"); 
	}
	@Test(dataProvider = "myData") 
	public void login(String Username, String Password) 
	{ 
	  
	WebElement userN = driver.findElement(By.name("username")); 
	  userN.sendKeys(Username); 
	  
	  WebElement passW = driver.findElement(By.name("password")); 
	  passW.sendKeys(Password); 
	  
	  WebElement login = driver.findElement(By.xpath("*//input[@value='Log in']")); 
	   login.click(); 
	  
	   WebElement profileImage = driver.findElement(By.xpath("*//img[@class='profile_image']")); 
	   profileImage.click(); 
	  
	   WebElement logout = driver.findElement(By.linkText("Log out")); 
	   logout.click(); 

	    driver.findElement(By.linkText("Log in")).click(); 
	 } 
	@DataProvider(name = "myData") 
	public Object[ ][ ] loginData() 
	{ 
	  Object[ ][ ] data = new Object[2][2]; 
	   data[0][0] = "1st username"; 
	   data[0][1] = "1st password"; 
	  data[1][0] = "2nd username"; 
	   data[1][1] = "2nd password"; 
	    return data; 
	  } 
	@AfterTest 
	public void close() 
	{ 
	   driver.close(); 
	  } 
}
