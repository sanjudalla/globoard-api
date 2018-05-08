package com.restAssured.gloBoard.stepDefinition;

import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.restAssured.gloBoard.testRunner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;

public class UserService extends BaseClass {
	String Register,Search;
	public UserService() throws IOException 
	{
		LoadConfig() ;
		RestAssured.baseURI = config.getProperty("HOST");
	}

			/*public static String END_POINT_Register = "/api/user/register";
			public static String END_POINT_search = "/api/user/search/{username}";*/

			@Given("user has registeration endpoint with headers")
			public void register_api() throws Throwable {
				 Register=config.getProperty("userServiceRegisterApi");
				request = RestAssured.given()
				.headers(BaseClass.setHeaders());
	}
		
		@When("^user hits the Registeration api$")
		public void register_user() throws Throwable {
			
			response = request.when().post(Register);

		}
		
		/*public static HashMap<String, String> setQueryParam() throws IOException {

			LoadDataPropFile();
			HashMap<String, String> queryParam = new HashMap<String, String>();
			queryParam.put("params[0].filterField", data.getProperty("FilterField[0]"));
			queryParam.put("params[0].filterValue", data.getProperty("FilterValue[0]"));
			queryParam.put("params[1].filterField", data.getProperty("FilterField[1]"));
			queryParam.put("params[1].filterValue", data.getProperty("FilterValue[1]"));
			return queryParam;

		}*/
		
		@When("^user provides username,password and name$")
		public static void jsonRequestRegister() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Sanju Dalla12345"); 
		requestParams.put("password", "globoard@123");
		requestParams.put("username", "sanjudalla12345");
		request.body(requestParams.toJSONString());
		
		}
		
		
		@Then("verify status code is (.*)")
		public void statusCheck(int statusCode) {
			response.then().assertThat().statusCode(statusCode);
		}
		
		@Then("verify response has (.*)")
		public String attributeInResponse(String attribute) {
			
			//boolean bodyAsString = response.body().jsonPath().get(attribute);
			
			String attributeValue=response.body().jsonPath().get(attribute);
			return attributeValue;
			/*System.out.println(id);
			//System.out.println(bodyAsString);


		Assert.assertTrue((Boolean) response.body().jsonPath().get(attribute));*/
					
		}
		
		@Given("^user has search endpoint with headers$")
		public void search_api() throws Throwable {
			 Search=config.getProperty("userServiceSearchApi");
			request = RestAssured.given()
			.headers(BaseClass.setHeaders());
}
		
		@When("^user provides username$")
		public static void jsonRequestSearch() {
		/*JSONObject requestParams = new JSONObject();
		requestParams.put("username", config.getProperty("searchUsername"));*/
		request.pathParam("username", config.getProperty("searchUsername"));
		
		}
		
		@When("^user hits search api$")
		public void search_user() throws Throwable {
			
			response = request.when().get(Search);

		}
		
		
	}

