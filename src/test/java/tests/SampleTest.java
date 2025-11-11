package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void verifyUserAPIResponse() {
        // Base URL for public testing API
        RestAssured.baseURI = "https://reqres.in/api";

        // Send GET request to /users/2
        Response response = RestAssured
                .given()
                .when()
                .get("/users/2")
                .then()
                .extract()
                .response();

        // Print the response for visibility
        System.out.println("Response Body: " + response.getBody().asString());

        // Verify the response code
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");

        // Verify that user data contains "Janet"
        String firstName = response.jsonPath().getString("data.first_name");
        Assert.assertEquals(firstName, "Janet", "Expected first name to be Janet");
    }
}
