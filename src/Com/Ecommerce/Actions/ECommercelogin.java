package Com.Ecommerce.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.Ecommerce.Utils.Readdataproperties;

public class ECommercelogin {
private WebDriver driver;  
public ECommercelogin(WebDriver driver) {
	this.driver=driver;
}

public void clear() throws Exception
{
	String name=Readdataproperties.GetDatafromproperties("Noplogin", "Username");
	By username=By.id(name);

	WebElement ele=driver.findElement(username);
	ele.clear();
}
public void clearpass() throws Exception
{
	String nopname=Readdataproperties.GetDatafromproperties("Noplogin", "Password");
	By userpass=By.id(nopname);

	WebElement ele1=driver.findElement(userpass);
	ele1.clear();
}
private  void SetUsername(String Username) throws IOException {
	String uname=Readdataproperties.GetDatafromproperties("Noplogin","Username");
	By usrname=By.id(uname);
	WebElement ele=driver.findElement(usrname);
	ele.sendKeys(Username);
	
}
private void SetPassword(String Password) throws IOException {
	String Pword=Readdataproperties.GetDatafromproperties("Noplogin","Password");
	By Psword=By.id(Pword);
	WebElement ele1=driver.findElement(Psword);
	ele1.sendKeys(Password);

}
private void Login() throws Exception {
	 
		String Login=Readdataproperties.GetDatafromproperties("Noplogin","LoGin");
		By LoGin=By.xpath(Login);
		WebElement Clk=driver.findElement(LoGin);
		Clk.click();
	
	
	}

public void NOpLogin(String Username,String Password) throws Exception {	
	this.SetUsername(Username);
	this.SetPassword(Password);
	this.Login();
}
public void Dasboard() throws IOException {
	String Dash=Readdataproperties.GetDatafromproperties("Noplogin","Catolog");
	By Catologg=By.xpath(Dash);
	WebElement Clk1=driver.findElement(Catologg);
	Clk1.click();
	System.out.println("Clicked Dashboard Scussfully");
}
public void Products() throws IOException {
	String POD=Readdataproperties.GetDatafromproperties("Noplogin","products");
	By pop=By.xpath(POD);
	WebElement Clk2=driver.findElement(pop);
	Clk2.click();
	System.out.println("Clicked products Successfully");
}
public void ProductName() throws IOException {
	String Pname=Readdataproperties.GetDatafromproperties("Noplogin","ProductName");
	By PNam=By.xpath(Pname);
	WebElement e3=driver.findElement(PNam);
	e3.sendKeys("Laptop");
	System.out.println("Entered the ProductName Successfully");
}
public void Category() throws IOException {
	String Cagy=Readdataproperties.GetDatafromproperties("Noplogin","CategorryID");
	By Cg=By.xpath(Cagy);
	Actions act=new Actions(driver);
	//WebElement e4=driver.findElement(Cg);
	Select sc=new Select(driver.findElement(Cg));
	sc.selectByIndex(4);
	System.out.println("Clicked the dropdown field Successfully");
}
}	
	



