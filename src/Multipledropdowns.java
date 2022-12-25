import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement d= driver.findElement(By.xpath("//select[@name='selenium_commands']"));

	      //object of Select class
	      Select s=new Select(d);
	      //get options of dropdown in list
	      java.util.List<WebElement> t=s.getOptions();
	      System.out.println("Options are: ");
	      for (WebElement i: t){
	         System.out.println(i.getText());
	      }	
	      //return true if multi-select dropdown
	      Boolean b=s.isMultiple();

	      System.out.println("Boolen value for drodown: "+ b);
	      //select item by index
	      s.selectByIndex(2);
	      Thread.sleep(1000);
	      //select item by visible text
	      s.selectByVisibleText("Wait Commands");
	      Thread.sleep(1000);
	      //get first selected option in dropdown
	      WebElement f = s.getFirstSelectedOption();
	      System.out.println("First selected option is: "+ f.getText());
	      //deselect option by index
	      s.deselectByIndex(2);
	      Thread.sleep(1000);
	      //deselect all selected items
	      s.deselectAll();
	      driver.close();
	}

}
