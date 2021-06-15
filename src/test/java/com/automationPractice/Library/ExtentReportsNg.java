package com.automationPractice.Library;

import static org.testng.Assert.assertTrue;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsNg extends Base {
	static ExtentSparkReporter reporter;
	static ExtentReports extent;
	//ExtentTest test;

	public static ExtentReports getExtentReport() {

		try {
		// System.getProperty("user.dir")--- gives the current project path
		String path = System.getProperty("user.dir") + "/ExtentReports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		extent = new ExtentReports();
		reporter.config().setReportName("Automation Practice Results");
		reporter.config().setDocumentTitle("Test Report");
		

		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", " Shrestha");
		extent.setSystemInfo("Job Id", "1001");
		
	} catch (Exception e) {
		logger.error("Error: ", e);
		assertTrue(false);
	}
	return extent;

	}

}
