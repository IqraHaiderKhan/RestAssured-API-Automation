package tests;

import framework.base.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class GetCommentByIdTest extends BaseTest {

    @Test
    public void testGetCommentById() {
        RestAssured
                .given()
                .when()
                .get("/comments/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}





