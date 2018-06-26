//Test Class

package PomObjectModelLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {
	@Test
 	public void TEST() {
		//set path for the browser
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		//launch the browser
		WebDriver driver =new FirefoxDriver();
		
		//enter the url
		driver.get("https://www.snapdeal.com/login");
		
		//creat object for the pageclass
		PageClass sd=new PageClass(driver);
		
		//call the methods using reference variable
		sd.userName("nikhithasri290@gmail.com");
		sd.continu();
		sd.password("nikhitha9");
		sd.loginBtn();
	}

}
