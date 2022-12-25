package Com.Ecommerce.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.Ecommerce.Utils.Readdataproperties;
import graphql.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class NOPAddnewProduct {
	private WebDriver driver; 
	Actions actions ;
	JavascriptExecutor javascriptexecutor;
	public NOPAddnewProduct(WebDriver driver) {
	
		this.driver=driver;
	}

	public void Catelog() throws IOException {
		String Dash=Readdataproperties.GetDatafromproperties("AddProduct","Catolog");
		By Catologg=By.xpath(Dash);
		WebElement Clk1=driver.findElement(Catologg);
		Clk1.click();
		System.out.println("Clicked Catelog Scussfully");
	}
	public void Products() throws IOException {
		String POD=Readdataproperties.GetDatafromproperties("AddProduct","products");
		By pop=By.xpath(POD);
		WebElement Clk2=driver.findElement(pop);
		Clk2.click();
		System.out.println("Clicked products Successfully");
	}
	
	public void AddNewClick() throws IOException {
		String Adneww=Readdataproperties.GetDatafromproperties("AddProduct","Addnew");
		By DD=By.xpath(Adneww);
		WebElement ele=driver.findElement(DD);
		ele.click();
		System.out.println("Clicked Addnew Successfully");
	}
	public void productName() throws IOException {
		String PDname=Readdataproperties.GetDatafromproperties("AddProduct","Productname");
		By PDN=By.xpath(PDname);
		WebElement ele1=driver.findElement(PDN);
		ele1.sendKeys("LaptopKalyan");
		System.out.println("Entered ProductName Successfully");
	}
	public void shortDescription() throws IOException {
		String shtDes=Readdataproperties.GetDatafromproperties("AddProduct","ShortDescription");
		By PDN=By.xpath(shtDes);
		WebElement el=driver.findElement(PDN);
		el.sendKeys("Its good");
		System.out.println("Entered ShortDescription Successfully");
	}
	public void paraGraph() throws IOException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String Pgrah=Readdataproperties.GetDatafromproperties("AddProduct","Paragragh");
		By PGF=By.xpath(Pgrah);
		WebElement ele2=driver.findElement(PGF);
		ele2.click();
		System.out.println("Clicked Paragraph Successfully");
}
	public void MoveToInline() throws IOException, InterruptedException {
		String Inline=Readdataproperties.GetDatafromproperties("AddProduct","Inline");
		By inlne=By.xpath(Inline);
		actions=new Actions(driver);
		WebElement ac=driver.findElement(inlne);
		actions.moveToElement(ac).build().perform();
		System.out.println("Mouseover Successfully");
		Thread.sleep(2000);
	}
	public void clkBold() throws IOException {
		String bold=Readdataproperties.GetDatafromproperties("AddProduct","Bold");
		By bb=By.xpath(bold);
		actions=new Actions(driver);
		WebElement bc=driver.findElement(bb);
		actions.moveToElement(bc).build().perform();
		bc.click();
		System.out.println("Bold entered Successfully");
	}
	public void fullDescripition() throws IOException {
		String fulldescp=Readdataproperties.GetDatafromproperties("AddProduct","Fulldescription");
		By FullDesc=By.xpath(fulldescp);
		WebElement fd=driver.findElement(FullDesc);
		fd.click();
		fd.sendKeys("Dass");
		System.out.println("Entered Full Descrption");
	}
	public void scrollDown() {
		javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,250)");
		System.out.println("ScroolDownSuccessfully");
	}
	public void publishedCHXbox() throws IOException {
		String checkbox=Readdataproperties.GetDatafromproperties("AddProduct","PublishedCheckBox");
		By chk=By.xpath(checkbox);
		WebElement ch=driver.findElement(chk);
		if(ch.isSelected()) {
			System.out.println("Checkboxis Selected");
		}
		else {
			System.out.println("Checkbox is Deselected");
		}
	}
	public void availblestartDate() throws IOException {
		String str=Readdataproperties.GetDatafromproperties("AddProduct","AvailbStartDate");
		By ss=By.xpath(str);
		WebElement bc=driver.findElement(ss);
		bc.click();
		System.out.println("StartDate Clicked Successfully");
	}
	public void Button() throws IOException {
		for(int i=0;i<2;i++) {
		String bt=Readdataproperties.GetDatafromproperties("AddProduct","Button3");
		By sss=By.xpath(bt);
		
		WebElement bd=driver.findElement(sss);
		bd.click();
		}
		System.out.println("Button Clicked Successfully");
	}
	public void startDate() throws IOException {
		String strt=Readdataproperties.GetDatafromproperties("AddProduct","StratDate");
		By stra=By.xpath(strt);
		WebElement elw=driver.findElement(stra);
		elw.click();
		System.out.println("Startdate  Successfully");
	}
	public void availbleEndDate() throws IOException {
		String stttt=Readdataproperties.GetDatafromproperties("AddProduct","AvailbEndDate");
		By ss=By.xpath(stttt);
		WebElement hh=driver.findElement(ss);
		hh.click();
		System.out.println("endDate clicked Successfully");
	}
	public void Buttonend() throws IOException {
		//for(int i=0;i<3;i++) {
		String btn=Readdataproperties.GetDatafromproperties("AddProduct","Button4");
		By ssss=By.xpath(btn);
		
		WebElement bd=driver.findElement(ssss);
		bd.click();
		//}
		System.out.println("Button Clicked Successfully");
	}
	
	
	public void endDate() throws IOException {
		String strt=Readdataproperties.GetDatafromproperties("AddProduct","EndDate");
		By strtt=By.xpath(strt);
		WebElement elee=driver.findElement(strtt);
		elee.click();
		System.out.println("enddate entered Successfully");
	}
	
	public void saveButton() throws IOException, InterruptedException {
		String Button=Readdataproperties.GetDatafromproperties("AddProduct","SaveButton");
		By buts=By.xpath(Button);
		WebElement b=driver.findElement(buts);
		b.click();
		
		//Thread.sleep(1000);
		/*
		 * String text=b.getText();
		 * 
		 * System.out.println(text); Assert.assertTrue(driver.equals(text));
		 * driver.navigate().refresh(); System.out.println("Successfully get POp msg");
		 */
		
	}
	public void scrollUp() {
		javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,-250)");
		System.out.println("ScrollUpsuccessfully");
	}
	public boolean getText(String expetedtext) throws Exception
	   {
		   String gettext=Readdataproperties.GetDatafromproperties("AddProduct", "gettext");
		   By getsuccesmeg=By.xpath(gettext);
		   WebElement GetSuccesmeg=driver.findElement(getsuccesmeg);
		   String actualtext=GetSuccesmeg.getText();
		   System.out.println(actualtext);
		   boolean status=GetSuccesmeg.getText().contains(expetedtext);
		   return status;		
	   }
	public  void getScreenshot(String image) throws Exception
	{   
		//File f=new File(image);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//Screenshot//"+image+".png"));	
}
}
