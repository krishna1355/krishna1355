import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://techbeamers.com/websites-to-practice-selenium-webdriver-online/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//span[text()='Tutorials ']")).click();
		WebElement ed=driver.findElement(By.xpath("(//a[@title='Selenium Step by Step Tutorial'])[1]"));
		act.moveToElement(ed).perform();
		
		//,,,,,,,,,,,,,Right Click for Using Contexxt Clickin Action Class,,,,,,,,,
		
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Interview Questions ']"));
act.contextClick(ele1).build().perform();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement e=driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select s=new Select(e);
		List<WebElement>t=s.getOptions();
		System.out.println("Options are:");
		for(WebElement i:t) {
			System.out.println(i.getText());
		}
		Boolean bs=s.isMultiple();
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByVisibleText("Switch Commands");
		driver.close();
		
	}

}
