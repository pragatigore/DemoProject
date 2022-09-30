package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement nicknameLabel;
	@FindBy(xpath="//span[@class='user-id']") private WebElement userIdLabel;
	@FindBy(xpath="//h4[@class='username']") private WebElement userNameLabel;
	@FindBy(xpath="//div[@class='email']") private WebElement emailIdLabel;
	@FindBy(xpath="//li//a[@href='/profile']") private WebElement myProfileDisplay;
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutBtn;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyNickname() throws Throwable
	{
		Thread.sleep(2000);
		return nicknameLabel.getText();
	}
	
	public boolean verifyUserIdlabel()
	{
	return userIdLabel.isDisplayed();
	
	}
	public boolean myprofileDisplay()
	{
		return myProfileDisplay.isEnabled();
	}
	
	
}