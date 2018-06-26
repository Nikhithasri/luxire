

                    // Login Script Using Webdriver Method 



package LoginScript;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class papperfry{
	
		public static void main(String[] args)
		
		{
			//set the path for driver
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			
			//launch the browser
			WebDriver driver = new FirefoxDriver();
			
			//enter the url
			driver.get("https://seller.pepperfry.com/merchant/login");
			
			// apply implicit wait
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//finding element by using locator and performing action
			driver.findElement(By.id("email")).sendKeys("nikhithasri290@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("nikhitha9");
			driver.findElement(By.id("merchant_login")).click();
			
			// verification
			String title = driver.getTitle();
			System.out.println(title);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if(title.equals("pepperfry"))
			
			{
					System.out.println("pass");
			}
			else
			{
			System.out.println("fail");
			}
			driver.close();
		}
	}
		
