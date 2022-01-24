package restassuredtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	void testGetUserList() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		// Validating status code
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 200);

		// Getting response body
		System.out.println(res.body().asString());
		System.out.println("----------------------------------------");
		System.out.println("The response body is:" + res.getBody().toString());

		// getting response time
		System.out.println("The response time is" + res.getTime());

		// Getting the header
		System.out.println("The content type header is:" + res.header("content-type"));
		System.out.println("The content type header is:" + res.getContentType());
		System.out.println("The response header are:" + res.headers());
	}
	
	@Test
	void testSingleUser() {
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		// Validating status code
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 200);

		System.out.println("----------------------------------------");
		// Getting response body
		System.out.println(res.body().asString());
		//System.out.println("----------------------------------------");
		System.out.println("The response body is:" + res.getBody().toString());

		// getting response time
		System.out.println("The response time is" + res.getTime());

		// Getting the header
		System.out.println("The content type header is:" + res.header("content-type"));
		System.out.println("The content type header is:" + res.getContentType());
		System.out.println("The response header are:" + res.headers());
	}
	
	@Test
	void testSingleUserParameter() {
		
		String id="5";
		Response res = RestAssured.get("https://reqres.in/api/users/"+id);
		// Validating status code
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(), 200);

		System.out.println("----------------------------------------");
		// Getting response body
		System.out.println(res.body().asString());
		//System.out.println("----------------------------------------");
		System.out.println("The response body is:" + res.getBody().toString());

		// getting response time
		System.out.println("The response time is" + res.getTime());

		// Getting the header
		System.out.println("The content type header is:" + res.header("content-type"));
		System.out.println("The content type header is:" + res.getContentType());
		System.out.println("The response header are:" + res.headers());
	}
}
