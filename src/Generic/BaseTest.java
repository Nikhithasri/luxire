package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic.Iautoconst;

public class BaseTest implements Iautoconst{
	  public WebDriver driver;
		
	  static
	  {
	    System.setProperty(GECKO_KEY,GECKO_VALUE);
	  }
	  @BeforeMethod
	  public void before() 
	  {
		 // String URL=PropertyFile.getProperties(PROPERTIES_FILE,"URL");
	  	driver=new FirefoxDriver();
	  	driver.get("https://luxire.com/");
	  	//String sIW=PropertyFile.getProperties(Iautoconst.PROPERTIES_FILE,"ITO");
		//long IW=Long.parseLong(sIW);
	  	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  }
	  
	  @AfterMethod
	  public void after()
	  {
	   driver.close();	  	
	  }
}