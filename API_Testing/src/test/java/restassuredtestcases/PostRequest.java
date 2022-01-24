package restassuredtestcases;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostRequest {

	@Test
	public void testPostCreateUser()
	{
		baseURI = "https://reqres.in/api";
		
		JSONObject reqData=new JSONObject();
		reqData.put("name","Supriya");
		reqData.put("job", "QE");
		
		System.out.println(reqData.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Connection","keep-alive")
			.body(reqData.toJSONString())
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			.log().all();
	}

}
