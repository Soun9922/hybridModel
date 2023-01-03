package BS_testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BS_pages.forgottenPass_Page;

import baseClass_BS.baseClass;
import bs_Utility.util_Test;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Listeners(lisner.lisner_Test.class)
public class forgetPass_Test extends baseClass {
	forgottenPass_Page fgrtPage;
	util_Test utility;
	public String SheetName = "Frgt_Pass_Email";
	
	public forgetPass_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		fgrtPage = new forgottenPass_Page();
	}
	
	@DataProvider
	public Object[][] getForgrtPass_Test_Data(){
		Object data[][] = utility.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider = "getForgrtPass_Test_Data")
	@Severity(SeverityLevel.NORMAL)
	@Description("Forget Username click on Application")
	@Feature("ForgetPass : 1")
	@Story("The user enter the valid email or username to search for the account")
	public void frgtPass_email(String email) throws InterruptedException {
		fgrtPage.identifyAccnt(email);
	}
}
