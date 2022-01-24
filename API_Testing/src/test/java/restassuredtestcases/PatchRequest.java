package restassuredtestcases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchRequest {
	@Test
	public void testPatchCreateUser()
	{
		baseURI = "https://reqres.in/api";
		
		JSONObject reqData=new JSONObject();
		reqData.put("name","Sanjay");
		//reqData.put("job", "QE");
		
		System.out.println(reqData.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Connection","keep-alive")
			.body(reqData.toJSONString())
		.when()
			.patch("/users/409")
		.then()
			.statusCode(200)
			.log().body();
	}
}
