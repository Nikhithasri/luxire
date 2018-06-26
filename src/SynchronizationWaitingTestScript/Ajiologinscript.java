
                              //  SynchronizationWaitingTestScript



package SynchronizationWaitingTestScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Ajiologinscript {

	public static void main (String[] args) 
		{
				
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ajio.com/shop/women");
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		//Using ElementToBeClickable
		WebElement signinbtn = driver.findElement(By.xpath("//a[.='Sign In']"));
		w.until(ExpectedConditions.elementToBeClickable(signinbtn));
		signinbtn.click();
		
		//Using VisibilityOf
		WebElement username = driver.findElement(By.id("j_username"));
		username.sendKeys("nikhithasri290@gmail.com");
		w.until(ExpectedConditions.visibilityOf(username));
		
		//Using VisibilityOfElementLocated
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_password"))).sendKeys("nikhitha9");
		
		//Using elementToBeClickable using locators
		w.until(ExpectedConditions.elementToBeClickable(By.id("loginbtn"))).click();			
		
		//Using titleIs
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleIs(title));
		System.out.println(title);
		
		String aurl = driver.getCurrentUrl();
		System.out.println(aurl);
				
		if(title.equals("AJIO | Online Shopping for Clothing, Footwear, Fashion Tech & Accessories for Men, Women & Kids"))
		{
			System.out.println("pass - working");
		}
		else
		{
			System.out.println("fail - not working");
		}
			driver.close();

		}
	}



