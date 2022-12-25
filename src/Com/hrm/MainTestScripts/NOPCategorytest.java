package Com.hrm.MainTestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Ecommerce.Actions.ECommercelogin;
import Com.Ecommerce.Actions.NOPCatologCategories;
import Com.Ecommerce.Utils.Browser;
import Com.Ecommerce.Utils.ReaddataExcelSheet;

public class NOPCategorytest {
	public WebDriver driver;

	 @BeforeTest 
	  public void Setup() throws Exception {
		  
		  List<String> browserinfo=ReaddataExcelSheet.GetDataFromExcelSheet("browser", 1);
		  
		  String  BrowserName=browserinfo.get(0);
		  String Browserkey=browserinfo.get(1);
		  
		  String Browserpath=browserinfo.get(2);
		  String Url=browserinfo.get(3);
	  driver=Browser.LaunchBrowser(BrowserName, Browserkey, Browserpath);
	  Browser.OpenUrl(Url);
	  
	  Thread.sleep(3000);
	  }
	 @Test(priority = 0)
	  public void verifyNOpPageLogin() throws Exception {
			
			 ECommercelogin e=new ECommercelogin(driver);
			 e.clear();
			 e.clearpass();
			 Thread.sleep(2000);
			java.util.List<String> browserinfo1=ReaddataExcelSheet.GetDataFromExcelSheet("EcomerceLogin", 1);
				String username=browserinfo1.get(0);
				String password=browserinfo1.get(1);
				 
			
			 e.NOpLogin(username, password);
			 
	 }
	 @Test(priority = 1)
	 public void verifyNopCategory() throws IOException {
		 NOPCatologCategories c=new NOPCatologCategories(driver);
		 c.Catelog();
		 c.cateGories();
		 c.addNew();
		 c.naMe();
		 c.upLoadFile();
		 
	 }
	 

}
