package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class GetUsersTest extends BaseTest {

    @Test
    public void testGetAllUsers() {
        RestAssured
                .given()
                .when()
                .get("/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetSingleUser() {
        RestAssured
                .given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}




