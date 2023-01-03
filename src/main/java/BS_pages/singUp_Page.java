package BS_pages;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass_BS.baseClass;

public class singUp_Page extends baseClass {

		@FindBy(linkText = "Create New Account")
		WebElement newAccnt;

		@FindBy(xpath = "//input[@name='firstname']")
		WebElement F_Name;

		@FindBy(xpath = "//input[@name='lastname']")
		WebElement L_Name;

		@FindBy(xpath = "//input[@name='reg_email__']")
		WebElement eml;

		@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
		WebElement email_Conf;

		@FindBy(xpath = "//input[@id='password_step_input']")
		WebElement new_Pwd;

		@FindBy(xpath = "//select[@name='birthday_day']")
		WebElement date;

		@FindBy(xpath = "//select[@name='birthday_month']")
		WebElement month;

		@FindBy(xpath = "//select[@name='birthday_year']")
		WebElement year;

		@FindBy(css = "input[value='2']")
		WebElement gender;

		@FindBy(name = "websubmit")
		WebElement submit;

		public singUp_Page() {
			PageFactory.initElements(driver, this);
		}

		public void signup(String firstname, String surname, String email, 
				String conf_email, String N_password,
				String B_Date, String B_Month, String B_Year) {

			newAccnt.click();
			F_Name.sendKeys(firstname);
			L_Name.sendKeys(surname);
			eml.sendKeys(email);
			email_Conf.sendKeys(conf_email);
			new_Pwd.sendKeys(N_password);
			date.sendKeys(B_Date);
			month.sendKeys(B_Month);
			year.sendKeys(B_Year);
			gender.click();
			submit.click();
		}
	}
