package Com.Ecommerce.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	private static WebDriver driver;
	public static WebDriver LaunchBrowser(String Browsername,String Browserkey,String Browserpath){
		System.setProperty(Browserkey,Browserpath);
		if(Browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
			driver=new EdgeDriver();
		return driver; 
	}

		
	public static void OpenUrl(String Url) {
		driver.get(Url);
	}
	public static void Closebrowser() {
		driver.close();
	}
	}


