package utils;

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
		LOGGER.info("Starting testcase"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		LOGGER.info("Testcase Pass" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		LOGGER.info("Testcase Fail" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		LOGGER.info("Testcase Skipped" + result.getName());
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
