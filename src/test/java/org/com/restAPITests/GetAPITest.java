package org.com.restAPITests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.com.base.TestBase;
import org.com.client.RestClient;
import org.json.JSONException;

public class GetAPITest extends TestBase {
	

	public GetAPITest() throws FileNotFoundException {
		super();
	}

	TestBase testbase;
	RestClient restClient;
	String serviceURL;
	String appURL;
	String url;
	
	@BeforeMethod
	public void setUp() throws IOException, JSONException, ClientProtocolException {
		testbase = new TestBase();
		serviceURL = prop.getProperty("serviceURL");
		appURL = prop.getProperty("URL");
		url = appURL+serviceURL;
		restClient = new RestClient();
		restClient.get(url);
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException, JSONException {
		restClient = new RestClient();
		restClient.get(url);
		
		System.out.println("*******************************************");
	}

}
