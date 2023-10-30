package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.BaseTest;
import Pom_scripts.Pom1;

public class TestScript1  extends BaseTest
{
	
	@Test(dataProvider = "testdata")
	public void test(String un,String pwd) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.uname(un);
		p.pwd(pwd);
		Thread.sleep(2000);
		p.clickBtn();
		Assert.fail();
	}
	@DataProvider(name="testdata")
	public Object[][] CreateData()
	{
		return new Object[][]
		{
			{"Santosh","admin"},
			{"Kaveri","manager"},
			
		};
	}



}
