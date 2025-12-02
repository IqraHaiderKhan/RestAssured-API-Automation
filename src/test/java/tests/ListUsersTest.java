package tests;

import framework.base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class ListUsersTest extends BaseTest {

    @Test
    public void testListUsers() {
        RestAssured
                .given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}


