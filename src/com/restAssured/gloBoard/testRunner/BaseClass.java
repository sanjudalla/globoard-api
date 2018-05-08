package com.restAssured.gloBoard.testRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	static FileInputStream fs;
	public static Properties config;
	public static RequestSpecification request;
	public static Response response;


	public BaseClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void LoadConfig() throws IOException  {
		//File f= new File("\\src\\com\\resrAssured\\gloBoard\\config\\config.properties");
		File f=new File("D:\\workspace\\workspace\\workspace\\GloBoard-api\\src\\com\\resrAssured\\gloBoard\\config\\config.properties");
		try {
			fs = new FileInputStream(f);
			config = new Properties();
		config.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fs.close();
		}
	}
	
	public static HashMap<String, String> setHeaders() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		map.put("Accept", "application/json");
		//map.put("Authorization", "Bearer " + getToken());

		return map;
	}

}
