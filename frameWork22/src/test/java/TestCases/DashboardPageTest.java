package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {
	DashboardPage Dash;
	LoginPage login;
	
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		login=new LoginPage();
		login.loginZerodhaApp();
		Dash=new DashboardPage();
		
	}
	
	
    @Test
    public  void verifyNicknameTest() throws Throwable
    {
    	String value=Dash.verifyNickname();
    	System.out.println(value);
    
    }
    @Test
    public void verifyUserIdlabel()
    {
    	boolean id=Dash.verifyUserIdlabel();
    	System.out.println(id);
    }
    
    @AfterMethod()
	public void exit()
	{
		driver.close();
	}
}