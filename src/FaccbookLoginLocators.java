import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaccbookLoginLocators {
	 @FindBy(xpath="//input[@autocomplete='username']")
	    public static String Username;
	  @FindBy(xpath = "//input[@autocomplete='current-password']")
	  public static String Password;
}
