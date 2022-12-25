import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String u = "https://www.tutorialspoint.com/about/about_careers.htm";
		driver.get(u);
	      
	      // identify element
	      WebElement t=driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
	      // get src attribute with getAttribute()
	      System.out.println("Src attribute is : " + t.getAttribute("src"));
	      driver.close();
	}

}
