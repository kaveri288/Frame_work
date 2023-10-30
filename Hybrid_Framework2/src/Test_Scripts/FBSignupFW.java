package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.BaseTest;
import Pom_scripts.FBSignupFwPOM;
import Pom_scripts.Pom1;

public class FBSignupFW extends BaseTest
{
	@Test(dataProvider = "testdata")
	public void test(String un,String pwd) throws InterruptedException
	{
		FBSignupFwPOM p1=new FBSignupFwPOM(driver);
		p1.Fname(un);
		p1.pwd(pwd);
		
		Thread.sleep(2000);
		p1.clkBtn();
		Assert.fail();
	}
	@DataProvider(name="testdata")
	public Object[][] CreateData()
	{
		return new Object[][]
		{
			{"Kaveri","Patil"},
			{"ABCD","manager"},
			
		};
	}

}
