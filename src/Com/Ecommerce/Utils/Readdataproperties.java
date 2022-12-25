package Com.Ecommerce.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readdataproperties {
	public static String GetDatafromproperties(String FileName,String key) throws IOException {
	String Filepath=".//Objects//"+FileName+".properties";
	FileInputStream fis=new FileInputStream(Filepath);
	Properties pro=new Properties();
	pro.load(fis);
	return pro.getProperty(key);
	}
	@Test
public void display() throws IOException {
	String pim=Readdataproperties.GetDatafromproperties("ECommerseObjectLocators", "Username");
	System.out.println(pim);
}

	@Test
public void display1() throws IOException {
	String pim=Readdataproperties.GetDatafromproperties("ECommerseObjectLocators", "Password");
	System.out.println(pim);
	}
@Test
	public void dislpay() throws Exception
	{
		String name=Readdataproperties.GetDatafromproperties("ECommerseObjectLocators","LoGin");
		System.out.println(name);
	}
		
	}


