package execution_With_all_annotation_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class Base_Class {
	
	

	@BeforeSuite
	public void configBS() {
		System.out.println("======Connect to DB before configue========");
	}
	
	@BeforeClass
	public void configBC() {
		System.out.println("===Launch Browser====");
	}
	
	
	@BeforeMethod
	public void configBM() {
		System.out.println("Login");
	}
		
	@AfterMethod
	public void configAM() {
		System.out.println("logout");
	}
	
	
	@AfterClass
	public void configAC() {
		System.out.println("===close Browser====");
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("======Close DB, Report backup ========");
	}
	

}
