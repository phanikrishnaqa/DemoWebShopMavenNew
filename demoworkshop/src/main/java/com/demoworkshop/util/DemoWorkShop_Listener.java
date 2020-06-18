package com.demoworkshop.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demoworkshop.qa.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class DemoWorkShop_Listener extends TestBase implements ITestListener{

	public void onTestStart(ITestResult result) {

		System.out.println("On test start ->:"+ result.getName());
		extentTest.log(LogStatus.INFO,result.getName() + " test is started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success ->:"+ result.getName());
		extentTest.log(LogStatus.PASS,result.getName() + " test is Pass");
		
	}

	public void onTestFailure(ITestResult result) {
		String screenshotPath = "";
		System.out.println("On test Failure ->:"+ result.getName());
		extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); 
		 //to add error/exception in extent report
		extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable());
		try {
			screenshotPath = getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//to add screenshot in extent report
		extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); 
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped ->:"+ result.getName());
		extentTest.log(LogStatus.SKIP,result.getName() + " test is skipped and the reason is "+ result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test Failed with success percentage ->:"+ result.getName());
		
	}

	public void onStart(ITestContext context) {
		System.out.println("On test start ->:"+ context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("");
		
	}
}
