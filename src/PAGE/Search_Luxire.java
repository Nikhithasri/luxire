package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
//import Generic.BaseTest; 

public class Search_Luxire extends BasePage {
	@FindBy(xpath="(//input[@id='search-input'])[2]")
			private WebElement sertb;
	@FindBy(xpath="(//button[@class='btn icon-fallback-text'])[2]")
private WebElement serbt;
public Search_Luxire(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void setsearchbox(String ser){
	sertb.sendKeys(ser);
}
	public void searchbutton(){
		serbt.click();
	}			
	}
