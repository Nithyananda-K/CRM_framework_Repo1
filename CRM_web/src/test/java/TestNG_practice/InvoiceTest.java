package TestNG_practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crmweb.base_test.BaseClass;

@Listeners(com.crmweb.listener_utility.ListImpClass.class)
public class InvoiceTest extends BaseClass {

	@Test(retryAnalyzer = com.crmweb.listener_utility.RetryListenerImp.class)
	public void createInvoiceTest() {
		System.out.println("Execute createInvoice Test");
		String actTitle = driver.getTitle();
		boolean titlecontain = actTitle.contains("Home");
		Assert.assertEquals(actTitle, "Login"); // Retry analyzer will execute when test case fail
//		Assert.assertTrue(titlecontain);
	}
}
