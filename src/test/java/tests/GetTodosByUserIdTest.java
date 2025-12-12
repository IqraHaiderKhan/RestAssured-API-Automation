package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GetTodosByUserIdTest extends BaseTest {

    @Test
    public void testGetTodosByUserId() {
        int userId = 1;

        Response response = apiClient.get("users/" + userId + "/todos");

        assertEquals(response.statusCode(), 200, "Status code should be 200");
    }
}



