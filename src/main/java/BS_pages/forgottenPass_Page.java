package BS_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass_BS.baseClass;

public class forgottenPass_Page extends baseClass {
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	WebElement fgrtPass;
	
	@FindBy(xpath = "//input[@id='identify_email']")
	WebElement email_identity;
	
	@FindBy(xpath = "//button[@name='did_submit']")
	WebElement search_click;
	
	public forgottenPass_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void identifyAccnt(String email) throws InterruptedException {
		fgrtPass.click();
		Thread.sleep(5000);
		email_identity.sendKeys(email);
		Thread.sleep(5000);
		search_click.click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
