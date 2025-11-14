package tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class SampleTest {

    @Test
    public void testGetUsers() {
        baseURI = ConfigReader.getBaseUrl();

        Response response =
                given()
                .when()
                .get("/users?page=2")
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
