package reporting;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import init.TestInitiator;

public class Listener implements ITestListener{
	private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

	@Override
	public void onTestStart(ITestResult result) {
		//LOGGER.info("Starting testcase"+ result.getName());
		
		ReportingClass.initScenario(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//LOGGER.info("Testcase Pass" + result.getName());
		
		ReportingClass.infoLogPass(result.getName()+"---------> TestCassed Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//LOGGER.info("Testcase Fail" + result.getName());
		
		
		try {
			ReportingClass.reportFailure(result.getName()+"---------> TestCassed Failed", TestInitiator.driver);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//LOGGER.info("Testcase Skipped" + result.getName());
		
		ReportingClass.infoLogSkip(result.getName()+"------------ TestCase Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
