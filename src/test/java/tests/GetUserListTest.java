package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class GetUserListTest extends BaseTest {

    @Test
    public void testGetUserList() {
        RestAssured
                .given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}




