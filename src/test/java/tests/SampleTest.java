package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

    @BeforeClass
    public void setup() {
        // ✅ Set base URI
        RestAssured.baseURI = "https://reqres.in/api";

        // ✅ Relax SSL certificate validation (for HTTPS)
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Test
    public void testGetUsers() {
        Response response = RestAssured
                .given()
                .log().all()
                .when()
                .get("/users?page=2")
                .then()
                .log().all()
                .extract()
                .response();

        System.out.println("Response Code: " + response.statusCode());
        Assert.assertEquals(response.statusCode(), 200, "Expected 200 OK");
    }
}
