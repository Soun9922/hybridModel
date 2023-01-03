package BS_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass_BS.baseClass;

public class loginPage extends baseClass {
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement logEmail;
	
	@FindBy(css = "input[d='pass']")
	WebElement logPass;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement logClick;
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String userName, String userPass) throws InterruptedException {
		logEmail.sendKeys(userName);
		Thread.sleep(5000);
		logPass.sendKeys(userPass);
		Thread.sleep(5000);
		logClick.click();
		Thread.sleep(5000);
		
//		driver.close();
	}
	
	public void multiUserLogin(String usrname, String pswd) throws InterruptedException {
		logEmail.sendKeys(usrname);
		Thread.sleep(5000);
		logPass.sendKeys(pswd);
		Thread.sleep(5000);
		logClick.click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
