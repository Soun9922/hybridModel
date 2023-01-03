package lisner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import baseClass_BS.baseClass;
import bs_Utility.util_Test;



public class lisner_Test extends baseClass implements ITestListener {
	
	util_Test util;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : onTestStart");
		extent.attachReporter(spark);
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : onTestSuccess");
		ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Sounak").assignDevice("Chrome");
		test.pass("Test is executed Successfully");
		extent.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : onTestFail");
		ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Sounak").assignDevice("Chrome");
		test.fail("Test is Failed");
		test.addScreenCaptureFromPath(util.captureScreen(driver));
		extent.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
	
	
}
