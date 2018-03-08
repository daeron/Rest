package com.projectname.utils;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import com.projectname.service.UtilityService;
import com.projectname.utils.Constants;

/**
 * This Class is used for calling the listeners after test completions
 * 
 * @author Optimus
 *
 */
@Listeners({com.projectname.service.TestListener.class})
public class BaseTest {
	
	protected StringBuffer baseUrl;
	protected StringBuffer postmanEchoAPIBaseUrl;
	protected SoftAssert softAssert;	 	
	
	protected BaseTest(){
		baseUrl = new StringBuffer(UtilityService.getPropertyFromFile("hostUrl") + UtilityService.getPropertyFromFile("port"));
	}
	
    /**
	 * Configure Logger
	 */
	static {
		PropertyConfigurator.configure(Constants.PATH_LOGGER);	
	}
	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		softAssert = new SoftAssert();
	}
}
