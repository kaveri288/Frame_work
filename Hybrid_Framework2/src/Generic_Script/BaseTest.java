package Generic_Script;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameworkConst{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(gecko_key,gecko_value);
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("--incognito");
		driver=new FirefoxDriver(opt);
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void close_app(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_screenshot.get_photo(driver);
		}
		driver.close();
	}

}
