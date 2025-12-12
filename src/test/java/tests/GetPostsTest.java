package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class GetPostsTest extends BaseTest {

    @Test
    public void testGetPosts() {
        RestAssured
                .given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}


