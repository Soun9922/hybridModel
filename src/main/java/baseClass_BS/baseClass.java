package baseClass_BS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class baseClass {
	public static Logger log = Logger.getLogger(baseClass.class);
	public static WebDriver driver;
	public static Properties prop;
	
	public ExtentReports extent = new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("Reports_Test/extentReport.html");
	
	public baseClass() {
		prop = new Properties();
		FileInputStream fileIP;
		try {
			fileIP = new FileInputStream("D:\\facebook_PageObjectModel_Automation\\"
			+ "fb_POM_automation\\src\\main\\java\\BS_config_properties\\config_prop");
			prop.load(fileIP);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\souna\\driverfortest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
//	public void takeScreenShot() {
//		TakesScreenshot tksht = (TakesScreenshot)driver;
//		File file = tksht.getScreenshotAs(OutputType.FILE);
//		File filesave = new File("D:\\facebook_PageObjectModel_Automation\\"
//				+ "fb_POM_automation\\Screenchot_Fail\\" + "Fail.png");
//		String absolute_path = filesave.getAbsolutePath();
//		try {
//			FileHandler.copy(file, filesave);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
