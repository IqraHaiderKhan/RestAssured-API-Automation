package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetUserByIdTest {

    @Test
    public void testGetUserById() {
        RestAssured.baseURI = "https://reqres.in";

        given()
            .log().all()
        .when()
            .get("/api/users/2")
        .then()
            .log().all()
            .statusCode(200)
            .body("data.id", equalTo(2))
            .body("data.email", notNullValue())
            .body("data.first_name", notNullValue())
            .body("data.last_name", notNullValue());
    }
}



