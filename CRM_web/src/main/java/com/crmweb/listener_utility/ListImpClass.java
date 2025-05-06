package com.crmweb.listener_utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crmweb.base_test.BaseClass;
import com.crmweb.genericwebdriver_utilty.UtilityclassObject;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;
import org.apache.commons.io.FileUtils;

// implementing two interface ITestListener, ISuiteListener
public class ListImpClass implements ITestListener, ISuiteListener {

	public ExtentSparkReporter spark;
	public static ExtentReports report;
	ExtentTest test;

	public void onStart(ISuite suite) {

		System.out.println("Report configuration");

		// Spark report config

		String time = new Date().toString().replace(" ", "_").replace(":", "_");

		spark = new ExtentSparkReporter("./AdvanceReport/report_" + time + ".html");
		spark.config().setDocumentTitle("CRM test suit result");
		spark.config().setReportName("CRM Reprt");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);

		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("BROWSER", "CHROME-113");

	}

	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();

	}

	public void onTestStart(ITestResult result) {
//		System.out.println("====" + result.getMethod().getMethodName() + "===Start==");
		test = report.createTest(result.getMethod().getMethodName()); // insert one test case in extend report
		UtilityclassObject.setTest(test);
		test.log(Status.INFO, result.getMethod().getMethodName() + " ===> STARTED <===");

	}

	public void onTestSuccess(ITestResult result) {
//		System.out.println("====" + result.getMethod().getMethodName() + "===End==");
		test.log(Status.PASS, result.getMethod().getMethodName() + " ===> COMPLETED <===");
	}

	public void onTestFailure(ITestResult result) {

		String testName = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
		String filepath = ts.getScreenshotAs(OutputType.BASE64);

		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filepath, testName + "_" + time);
		test.log(Status.FAIL, result.getMethod().getMethodName() + " ===> FAILED <===");

	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName() + " ===> SKIPPED <===");
		test.log(Status.SKIP, "Reason: " + result.getThrowable()); // Log reason for skipping
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        test.log(Status.WARNING, result.getMethod().getMethodName() + " failed but within success percentage.");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
        test.log(Status.FAIL, result.getMethod().getMethodName() + " failed due to timeout.");
	}
}
