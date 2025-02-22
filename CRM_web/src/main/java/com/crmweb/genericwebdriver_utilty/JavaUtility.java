package com.crmweb.genericwebdriver_utilty;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaUtility {

	public int getRandomNumber() {
		Random random = new Random();
		int ranDomNumber = random.nextInt();
		return ranDomNumber;
	}

	public String getSystemDateYYYYDDMM() {

		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);
		return date;
	}

	public String getRequiredDateYYYDDMM(int days) {

		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);

		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days); // positve value will give next day, negetive value give previous day
		String reqDate = sdf.format(cal.getTime());
		return reqDate;
	}

	public static void java_pgm_get_date_time() {
		// TODO Auto-generated method stub

		// to get the current date by creating a Date Object
		Date dateobj = new Date();

		// will get the date time
		System.out.println(dateobj);
		System.out.println(dateobj.toString());

		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String actualDate = sim.format(dateobj);
//		System.out.println(actualDate);

		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30); // positve value will give next day, negetive value give previous day

		String dataRequred = sim.format(cal.getTime());
		System.out.println("final" + dataRequred);
	}

	public static void java_pgm_get_timestamp() {
		String time = new Date().toString();
		System.out.println(time); // this will give in Thu Feb 20 13:33:24 IST 2025
		String formatTime = time.replace(" ", "_").replace(":", "_");
		System.out.println(formatTime);

	}

	
	// taking the screen shot code 
	public static void  takescreenshot() throws IOException {
//		 ThreadLocal<WebDriver> driver = UtilityclassObject.driver;
		    WebDriver driver = new ChromeDriver();
		    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    File destFile = new File("./java_util/screenshot.png");
		    FileUtils.copyFile(srcFile, destFile);
//		    return destFile; // Returning the screenshot file    ( replace File for void )
		    
	}

	public static void main(String[] args) throws IOException {
		JavaUtility ju = new JavaUtility();
		System.out.println(ju.getSystemDateYYYYDDMM());
		System.out.println("------------------------------------");
		System.out.println(ju.getRequiredDateYYYDDMM(30));
		System.out.println("------------------------------------");
//		java_date_time();
//		System.out.println(timestamp());
		java_pgm_get_timestamp();
		takescreenshot();
	}
}
