package tests;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import utils.ConfigReader;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import framework.reporting.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class UserApiTests {

    @Test
    public void getUsers_shouldReturn200() {
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

    @Test
    public void createUser_shouldReturn201() {
        baseURI = ConfigReader.getBaseUrl();

        String body = """
                { "name": "morpheus", "job": "leader" }
                """;

        Response response =
                given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/users")
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test
    public void updateUser_shouldReturn200() {
        baseURI = ConfigReader.getBaseUrl();

        String body = """
                { "name": "morpheus", "job": "zion resident" }
                """;

        Response response =
                given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put("/users/2")
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void deleteUser_shouldReturn204() {
        baseURI = ConfigReader.getBaseUrl();

        Response response =
                given()
                .when()
                .delete("/users/2")
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 204);
    }
}
