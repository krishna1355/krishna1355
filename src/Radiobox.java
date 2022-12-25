import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\SeleniumJars\\\\chromedriver.exe\\\\"
				+ "");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("(//input[contains(text(),'')])[1]")).click();
		System.out.println("Radiobutton Clicked");

	}

}
