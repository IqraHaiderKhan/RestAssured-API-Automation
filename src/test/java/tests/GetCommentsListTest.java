package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class GetCommentsListTest extends BaseTest {

    @Test
    public void testGetCommentsList() {
        RestAssured
                .given()
                .when()
                .get("/comments")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}


