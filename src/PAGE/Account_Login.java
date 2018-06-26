package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
//import Generic.BaseTest;

public class Account_Login extends BasePage {
	
	@FindBy(id="CustomerEmail")
	private WebElement unTb;
	
	@FindBy(xpath="((//input[@class='input-full'])[2])")
	private WebElement pwTb;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement lnBn;
	
	
	 public Account_Login(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void SetUserName(String un)
	 {
		 unTb.sendKeys(un);
	 }	
	 public void SetPassword(String pw)
	 {
		 pwTb.sendKeys(pw);
	 }	
     public void Login_Button()
     {
    	 lnBn.click();
     }

}
