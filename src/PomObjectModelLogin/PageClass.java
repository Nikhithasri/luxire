                                      //Pom Object Model Login

//Page Class 

package PomObjectModelLogin;
	//Using POM
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.Reporter;
	public class PageClass {
		//Declaration of Elements
		@FindBy(xpath="//input[@id='userName']")
		private WebElement usernametextbox;
		@FindBy(xpath="//button[@id='checkUser']")
		private WebElement continuebtn;
			
		@FindBy(id="j_password_login_uc")
		private WebElement passwordtextbox;
			
		@FindBy(xpath="//button[@id='submitLoginUC']")
		private WebElement loginbtn;
		
		//Initialization of Elements
		public PageClass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			
		//Utilization of Elements 
		public void userName(String u) 
		{
			usernametextbox.sendKeys(u);	
		}
		public void continu()
		{
			continuebtn.click();
			}
		public void password(String p)
		{
			passwordtextbox.sendKeys(p);
		}
		public void loginBtn() 
		{
			loginbtn.click();	
		}
		
		//Verification
		public void verficationOfTitle(WebDriver driver)
		{
			String actual_title = driver.getTitle();
			Reporter.log(actual_title,true);
			Assert.assertEquals(actual_title, "Home Page");
		}
		}



