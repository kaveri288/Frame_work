package Generic_Script;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
