package tests;

import framework.base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetTodosTest extends BaseTest {

    @Test
    public void testGetTodos() {
        Response response = RestAssured
                .given()
                .when()
                .get("/todos");

        assertEquals(200, response.getStatusCode());
    }
}


