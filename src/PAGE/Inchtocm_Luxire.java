package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Inchtocm_Luxire extends BasePage {
	@FindBy(xpath=("(//span[@class='measurements-triger__view'])[2]"))
			private WebElement adjbt;
	public Inchtocm_Luxire(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void measurement(){
		adjbt.click();
	}
}
