package TestNG_practice;

import org.testng.annotations.Test;

public class Dependency_test {
	
	
	@Test
	public void cancelOrder_test() {
		System.out.println("Order canecled");
		String name= null;
		System.out.println(name.equals("123"));
	}
	
	@Test(dependsOnMethods = "cancelOrder_test" )
	public void ReturnOrder_test() {
		System.out.println("Start to Return");
	}

}
