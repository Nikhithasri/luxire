package Script;

import org.testng.annotations.Test;

//import Generic.BasePage;
import Generic.BaseTest;

import Generic.Excel;
import PAGE.Account_Login;
import PAGE.Custom_made_Homepage;
import PAGE.Search_Luxire;

public class SearchforIteam extends BaseTest{
	@Test
	public void Test() throws Exception
	{
		Custom_made_Homepage c=new Custom_made_Homepage(driver);
		c.ACCOUNT(driver);
		c.LoginBt();
		Account_Login a=new Account_Login(driver);
		String Un = Excel.getdata(EXCEL_FILE,"Sheet1",0,0);
		a.SetUserName(Un);
		String Pw = Excel.getdata(EXCEL_FILE,"Sheet1",1,0);
		a.SetPassword(Pw);
		a.Login_Button();
		Search_Luxire sl=new Search_Luxire(driver);
		String ser = Excel.getdata(EXCEL_FILE,"Sheet1",3,0);
		sl.setsearchbox(ser);
		sl.searchbutton();
	}
}
