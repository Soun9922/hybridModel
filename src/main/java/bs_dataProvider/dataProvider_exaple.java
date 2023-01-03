package bs_dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider_exaple {
	
	@DataProvider
	public Object[][] datas(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Sounak";
		data[0][1] = "Sarkar2278";
		data[1][0] = "Lakhaman";
		data[1][1] = "Lauvku9900";
		return data;
	}
	@Test(dataProvider = "datas")
	public void login(String name, String pswd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\souna\\driverfortest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pswd);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.close();
	}
}
