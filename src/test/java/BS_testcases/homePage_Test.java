package BS_testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BS_pages.loginPage;
import BS_pages.redirectToHomePage;
import baseClass_BS.baseClass;
import bs_Utility.util_Test;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Listeners(lisner.lisner_Test.class)
public class homePage_Test extends baseClass {
	util_Test utility;
	public String SheetName = "Home_Page_TestData";
	public homePage_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@DataProvider
	public Object[][] homePageData(){
		Object data[][] = utility.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider = "homePageData")
	@Severity(SeverityLevel.NORMAL)
	@Description("Application will redirect to home page after login")
	@Feature("HomePage : 1")
	@Story("The user enter the valid email or username to perform the actions")
	public void singleUserHomePageTest(String username, String pswd) throws InterruptedException {
		loginPage logPg = new loginPage();
		redirectToHomePage page = new redirectToHomePage();
		try {
			logPg.login(username, pswd);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.performActions();
	}
}
