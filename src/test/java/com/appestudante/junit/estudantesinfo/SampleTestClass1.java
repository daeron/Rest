package com.projectname.apimodulename.testscripts;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.projectname.service.ApiCommunicatorService;
import com.projectname.service.UtilityService;
import com.projectname.utils.AssertionConstants;
import com.projectname.utils.BaseTest;
import com.projectname.utils.Constants;

/**
 * Class contains post test cases for Sample API prvided by 'jsonplaceholder.typicode.com'
 * 
 * @author Optimus
 *
 */
public class SampleTestClass1 extends BaseTest {

	private static Logger log;
	private String apiEndPointUrl;
	Map<String, String> subTypesWithKey;

	public SampleTestClass1() throws IOException {
		log = LoggerFactory.getLogger(SampleTestClass1.class);		
		apiEndPointUrl = baseUrl.append(UtilityService.getPropertyFromFile("sampleTestURL")).toString();
		subTypesWithKey = new HashMap<String, String>();
		subTypesWithKey.put("form_fields", "pnpCcFormFieldsModel");
	}

	/**
	 * Test Case to verify the mapping of fields in request and response
	 * 
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test(description = "To verify the mapping of fields in request and response", groups = { "Smoke", "Regression" })
	public void VerifyFieldMapping() throws IOException,JSONException {

		// Getting request data from json file
		log.info("Setting Request Data");
		String requestData = UtilityService.getTestDataFile(UtilityService.getPropertyFromFile("testDataFolder") + UtilityService.getPropertyFromFile("sampleTestAPI")+"Request_01.json");
				
		// Fetching Response
		log.info("Fetching Response");
		Response response = ApiCommunicatorService.getApiInstance().sendPostRequest(apiEndPointUrl, requestData);

		// Response fields
		log.info("Fetching Response fields values from Java WS");
		//TODO Instead of 'sampleField1', use names which signifies the actual fields
		String sampleField1 = UtilityService.getRequestModel(requestData).getMids().get(0).getOrders().get(0).getOrderId();
		String sampleField2 = UtilityService.getRequestModel(requestData).getMids().get(0).getSettings().getMidUsername();		
		String sampleField3 = UtilityService.getRequestModel(requestData).getMids().get(0).getOrders().get(0).getProcessId();		
		String sampleField4 = UtilityService.getRequestModel(requestData).getMids().get(0).getOrders().get(0).getAmount();
		
		// Request Fields
		log.info("Fetching Request Fields values");
		String responseSampleField1 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getOrders().get(0).getOrderId();
		String responseSampleField2 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getSettings().getMidUsername();		
		String responseSampleField3 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getOrders().get(0).getProcessId();		
		String responseSampleField4 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getOrders().get(0).getAmount();
		
		// Assertions
		log.info("Applying assertions to verify the mappings of request-response fields");
		//TODO Use Relevant name for Assertion constant message instead of 'SAMPLE_FIELD1_MAPPING'
		softAssert.assertEquals(sampleField1, responseSampleField1, AssertionConstants.SAMPLE_FIELD1_MAPPING);
		softAssert.assertEquals(sampleField2, responseSampleField2,	AssertionConstants.SAMPLE_FIELD2_MAPPING);
		softAssert.assertEquals(sampleField3, responseSampleField3, AssertionConstants.SAMPLE_FIELD3_MAPPING);
		softAssert.assertEquals(sampleField4, responseSampleField4, AssertionConstants.SAMPLE_FIELD4_MAPPING);
		softAssert.assertAll();
	}

	/**
	 * Test Case to verify the default values of the response fields
	 * 
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test(description = "To verify the default values of the response fields", groups = { "Smoke", "Regression" })
	public void VerifyFieldValues() throws IOException, JSONException {
		
		// Getting request data from json file
		log.info("Setting Request Data");
		String requestData = UtilityService.getTestDataFile(UtilityService.getPropertyFromFile("testDataFolder") + UtilityService.getPropertyFromFile("sampleTestAPI")+"Request_01.json");
				
		// Fetching Response
		log.info("Fetching Response");
		Response response = ApiCommunicatorService.getApiInstance().sendPostRequest(apiEndPointUrl, requestData);

		// Response fields
		log.info("Fetching Response fields values from Java WS");
		//TODO Instead of 'sampleField1', use names which signifies the actual fields
		String sampleField1 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getOrders().get(0).getOrderId();
		String sampleField2 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getSettings().getMidUsername();		
		String sampleField3 = UtilityService.getResponseModel(response.asString()).getMids().get(0).getOrders().get(0).getProcessId();		
		
		// Assertions
		log.info("Applying assertions to verify the default values of response");
		softAssert.assertEquals(sampleField1, Constants.GENERAL_PLACEHOLDERS.get("Field1"), AssertionConstants.INCORRECT_SAMPLE_FIELD1_MESSAGE);		
		softAssert.assertEquals(sampleField2, Constants.GENERAL_PLACEHOLDERS.get("Field2"), AssertionConstants.INCORRECT_SAMPLE_FIELD2_MESSAGE);		
		softAssert.assertEquals(sampleField3, Constants.GENERAL_PLACEHOLDERS.get("Field3"), AssertionConstants.INCORRECT_SAMPLE_FIELD3_MESSAGE);		
		softAssert.assertAll();
	}
}

