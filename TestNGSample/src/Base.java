import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {
	
	ExtentReports extent;
	ExtentTest logger; 
	
	@BeforeTest
	public void startReport()
	{
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/ExtentReport.html", true);

		extent
                .addSystemInfo("Host Name", "Madhu")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "MadhuBabu Velpuri");
                
                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}

	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}
		else
		{
			logger.log(LogStatus.PASS, "Test Case Passed is "+result.getName());
		}
		
		extent.endTest(logger);
	}
	@AfterTest
	public void endReport(){ 
                extent.flush();
                
                extent.close();
    }
	
	
}
