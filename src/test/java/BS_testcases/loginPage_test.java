package BS_testcases;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BS_pages.loginPage;
import baseClass_BS.baseClass;
import bs_Utility.util_Test;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Listeners(lisner.lisner_Test.class)

public class loginPage_test extends baseClass {
	loginPage log_Page;
	
	public String SheetName = "Test_Data";
	
	public loginPage_test() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		log_Page = new loginPage();
	}
	@Test(priority = 1)
	@Severity(SeverityLevel.MINOR)
	@Description("User login the application")
	@Feature("Login : 1")
	@Story("The user enter the valid username and password then login the application")
	public void loginTest() throws InterruptedException {
		log_Page.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getLoginTestDatas(){
		Object data[][] = util_Test.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider = "getLoginTestDatas")
	@Severity(SeverityLevel.CRITICAL)
	@Description("User login the application")
	@Feature("Login : 2")
	@Story("The user enter the valid username and password then login the application")
	public void multiUserTest(String userName, String pswd) throws InterruptedException {
		log_Page.multiUserLogin(userName, pswd);
	}
	
}
