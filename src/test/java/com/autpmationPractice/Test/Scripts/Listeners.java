package com.autpmationPractice.Test.Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automationPractice.Library.Base;
import com.automationPractice.Library.ExtentReportsNg;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends Base implements ITestListener {
	ExtentTest test;

	ExtentReports extent = ExtentReportsNg.getExtentReport();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName()); // create new entry in the report.
		extentTest.set(test);
	}

	
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Passed...........");
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		extentTest.get().fail(result.getThrowable());
		//WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e) {
		
		}
		
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName, driver), result.getMethod().getMethodName()); // calling screenshot method
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public void onTestSkipped(ITestResult result) {
//		
//		ITestListener.super.onTestSkipped(result);
//	}
//
//	
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	
//	public void onTestFailedWithTimeout(ITestResult result) {
//		
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	
//	public void onStart(ITestContext context) {
//		
//		ITestListener.super.onStart(context);
//	}

	
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}
	
	

}
