package TestNG_practice;

import org.testng.annotations.Test;

public class InvocationCount_test {
	
	
	@Test
	public void cancelOrder_test() {
		System.out.println("Order canecled");
		
	}
	
	@Test(invocationCount = 2 )
	public void ReturnOrder_test() {
		System.out.println("Start to Return");
	}

}
