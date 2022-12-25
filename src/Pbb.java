import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/demo");
		driver.findElement(By.xpath("//input[@placeholder='Company Name']")).sendKeys("Ust");
WebElement ele=driver.findElement(By.xpath("//input[@id='inputFirstName2']"));
ele.sendKeys("Ram");
System.out.println("Print the Firstname SuccessFully");
WebElement ele1=driver.findElement(By.xpath("//input[@id='inputLastName2']"));
ele1.sendKeys("Laxman");
System.out.println("print lastname ");
WebElement num=driver.findElement(By.xpath("(//input[@id='mobileid'])[2]"));
num.sendKeys("1234567823");
System.out.println("print number");
WebElement mail=driver.findElement(By.xpath("(//input[@id='inputEmail'])[2]"));
mail.sendKeys("abc@gmail.com");
System.out.println("print gmail");
Actions act=new Actions(driver);
Select sc=new Select(driver.findElement(By.xpath("(//select[@id='prod_type1'])[2]")));
sc.selectByIndex(2);
System.out.println("Select the Option");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
System.out.println("Clicked the Button");
}
}