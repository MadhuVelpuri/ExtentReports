import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TestNGAssertions extends Base {
	
	@Test
	public void testAssert()
	{
		logger = extent.startTest("failTest");
		Assert.assertEquals("Madhu", "Madhu");
		logger.log(LogStatus.PASS, "Test Case Status is passed");
		
		//System.out.println("Assertion is passed");
	}
	
	
	@Test
	public void testAssert1()
	{
		
		//System.out.println("Assertion is passed");
		logger = extent.startTest("failTest");
		Assert.assertEquals("Madhu", "Babu");
		logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	}
	
	@Test
	public void testAssert2()
	{
		//System.out.println("Assertion is passed");
				logger = extent.startTest("failTest");
				Assert.assertEquals("Madhu", "Babu");
				logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	}
	
	
}
