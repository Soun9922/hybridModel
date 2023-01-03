package BS_pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass_BS.baseClass;

public class redirectToHomePage extends baseClass{
	
	
	@FindBy(xpath = "//a[@aria-label='Friends']")
	WebElement frnd;
	
	@FindBy(xpath = "//span[text()='All Friends']")
	WebElement allFrnds;
	
	public redirectToHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void performActions() throws InterruptedException {
		
		Actions actn = new Actions(driver);
//		Alert alrt = driver.switchTo().alert();
//		alrt.dismiss();
		Thread.sleep(2000);
		actn.click(frnd);
		Thread.sleep(3000);
		actn.click(allFrnds);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}
	
}
