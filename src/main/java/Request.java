import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Request {

	@Test
	public void requestGet() {
		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification request = given();

		request.queryParam("page", 2);

		request.header("Content-Type", "application/json");

		Response response = request.get("/api/users");

		int statusCode = response.getStatusCode();

		Assert.assertEquals(statusCode, 201);
		long time = response.time();

		System.out.println(time);

		String asString = response.getBody().asPrettyString();
		System.out.println(asString);
	}

}
