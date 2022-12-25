import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/automate");
		
		  driver.findElement(By.xpath("(//button[@aria-label='Products'])[1]")).click();
		   System.out.println("Clicked successfully"); 
		   Actions act=new Actions(driver);
		   
		  
		   WebElement  ele=driver.findElement(By.xpath("//a[@data-product='Automate']"));
		  act.moveToElement(ele).build().perform();
		  System.out.println("Clicked Automate");
		  JavascriptExecutor javascriptexecutor = (JavascriptExecutor)driver;
			javascriptexecutor.executeScript("window.scrollBy(0,250)");
			System.out.println("ScroolDownSuccessfully");
			
			javascriptexecutor.executeScript("window.scrollBy(0,-250)");
			System.out.println("ScroolUpSuccessfully");
		 
		
		
		driver.findElement(By.xpath("//button[@class='developers-dropdown-toggle dropdown-toggle']")).click();
	
		Actions actions=new Actions(driver);
	
			WebElement ele1=driver.findElement(By.xpath("//a[text()='Status']"));
			actions.moveToElement(ele1).build().perform();
			System.out.println("Moving is Status");
	/*	for(int i=0;i<=3;i++) {
			Thread.sleep(2000);
	driver.navigate().refresh();
	ele.sendKeys(Keys.ARROW_DOWN);*/
	
	actions.moveToElement(ele1).build().perform();
			
	ele1.sendKeys(Keys.ENTER);
	System.out.println("Clicked Status");
			
	}
	}

