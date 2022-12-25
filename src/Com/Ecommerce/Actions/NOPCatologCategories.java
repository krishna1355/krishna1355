package Com.Ecommerce.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.Ecommerce.Utils.Readdataproperties;

public class NOPCatologCategories {
private WebDriver driver;
public NOPCatologCategories(WebDriver driver){
	this.driver=driver;
}



public void Catelog() throws IOException {
	String Dash=Readdataproperties.GetDatafromproperties("Category","Catolog");
	By Catologg=By.xpath(Dash);
	WebElement Clk1=driver.findElement(Catologg);
	Clk1.click();
	System.out.println("Clicked Catelog Scussfully");
}
public void cateGories() throws IOException {
	String categiry=Readdataproperties.GetDatafromproperties("Category","Cateloggi");
	By Categoryy=By.xpath(categiry);
	WebElement ele2=driver.findElement(Categoryy);
	ele2.click();
	System.out.println("Clicked Category Option Successfully");
}
public void addNew() throws IOException {
	String addNNew=Readdataproperties.GetDatafromproperties("Category", "Addnew");
	By addn=By.xpath(addNNew);
	WebElement addnew=driver.findElement(addn);
	addnew.click();
	System.out.println("Addnew SuccessFully");
}
public void naMe() throws IOException {
	String name=Readdataproperties.GetDatafromproperties("Category", "Name");
	By addname=By.xpath(name);
	WebElement addnamee=driver.findElement(addname);
	addnamee.sendKeys("RamaRAo");
	System.out.println("Entered Successfully");
	
}
public void upLoadFile() throws IOException {
	String opload=Readdataproperties.GetDatafromproperties("Category", "Uploadfile");
	By upload=By.xpath(opload);
	WebElement uppload=driver.findElement(upload);
	uppload.click();
	uppload.sendKeys("C:\\Users\\krish\\OneDrive\\Pictures\\Screenshots");
	System.out.println("upload Successfully");
	
}

}
