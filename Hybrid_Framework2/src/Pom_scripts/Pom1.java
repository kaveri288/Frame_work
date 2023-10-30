package Pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic_Script.BasePage;

public class Pom1 extends BasePage{
	
		@FindBy(name="email")
		private WebElement uname;
		
		@FindBy(id="pass")
		private WebElement pwd;
		
		@FindBy(xpath="//button[@name='login']")
		private WebElement clickBtn;
		
		public Pom1(WebDriver driver)
		{
			super(driver);
		}
		public void uname(String un)
		{
			uname.sendKeys(un);
		}
		public void pwd(String pwd1)
		{
			pwd.sendKeys(pwd1);
		}
		public void clickBtn()
		{
			clickBtn.click();
		}
		
	}


