package org.com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.net.ssl.SSLContext;

public class TestBase {

	public Properties prop;
	
	public TestBase() throws FileNotFoundException {
			
		try{
			   
			prop = new Properties();
			FileInputStream ip = new FileInputStream("H:\\Java_Practice\\Eclipse_WorkSpace_1\\restAPI\\src\\main\\java\\org\\com\\properties\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
