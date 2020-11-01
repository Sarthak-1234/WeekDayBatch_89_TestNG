package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import init.TestInitiator;
import pageObject.BusHireObject;

//@Listeners(utils.Listener.class)
public class BusHireTest extends TestInitiator{
	private static final Logger LOGGER = LoggerFactory.getLogger(BusHireTest.class);
	
	
	@Test
	public void getTitle() {
		LOGGER.info("Running testcase of Bus Hire Test");
		System.out.println("Title is: "+bushirepage.getCurrentTitle());
	}		

}
