package org.com.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class RestClient {

	//1. GET Method
	public void get(String URL) throws ClientProtocolException, IOException, JSONException {
		CloseableHttpClient httpClient = HttpClients.createDefault();  // Creating HTTPClient Request for execution
		HttpGet httpGet = new HttpGet(URL); // Create HTTPGET request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet); // Executing the HTTPGet URL
		
		//Printing the statusCode of the request
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code " + statusCode);
		
		
		//Getting Response in form of String.
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		System.out.println("Response Code is : " + responseString);
		
		
		//Converting the responseString to JSON Object
		JSONObject responseJSONObject = new JSONObject(responseString);
		System.out.println("Response Code is : " + responseJSONObject);
		
		
		//Getting all the header from header array and printing them
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		
		for(Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Headers Array : " + headerArray);
		
	}
	
}
