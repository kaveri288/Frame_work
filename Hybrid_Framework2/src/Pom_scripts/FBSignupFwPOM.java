package Pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Script.BasePage;

public class FBSignupFwPOM extends BasePage
{
	@FindBy(name="firstname")
	private WebElement Fname;
	
	@FindBy(name="lastname")
	private WebElement Lname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement pwd;
	
	@FindBy(name="websubmit")
	private WebElement clkBtn;
	
	
	
	public FBSignupFwPOM(WebDriver driver) 
	{
		super(driver);
	}
	public void Fname(String un)
	{
		Fname.sendKeys(un);
	}
	public void Lname(String Lnme)
	{
		Lname.sendKeys(Lnme);
	}
	public void email(String eml)
	{
		email.sendKeys(eml);
	}
	public void pwd(String pswd)
	{
		pwd.sendKeys(pswd);
	}
	public void clkBtn()
	{
		clkBtn.click();
	}
	

}
