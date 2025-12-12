package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class GetUserByIdTest extends BaseTest {

    @Test
    public void testGetUserById() {
        RestAssured
                .given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}



