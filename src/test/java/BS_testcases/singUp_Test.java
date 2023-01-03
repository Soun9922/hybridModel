package BS_testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BS_pages.singUp_Page;
import baseClass_BS.baseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Listeners(lisner.lisner_Test.class)
public class singUp_Test extends baseClass {
	singUp_Page sgnUp;
	
	public singUp_Test() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		sgnUp = new singUp_Page();
	}
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Application used for singup new user")
	@Feature("SignUp : 1")
	@Story("The user enter the valid email or username and password for create an account")
	public void singupTest() {
		sgnUp.signup(prop.getProperty("fname"), prop.getProperty("lname"),
		prop.getProperty("Email"), prop.getProperty("confirm_Email"), 
		prop.getProperty("newpass"), prop.getProperty("date"),
		prop.getProperty("month"), prop.getProperty("year"));
		}
}
