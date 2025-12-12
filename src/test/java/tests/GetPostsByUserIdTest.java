package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GetPostsByUserIdTest extends BaseTest {

    @Test
    public void testGetPostsByUserId() {
        int userId = 1;

        Response response = apiClient.get("posts?userId=" + userId);

        // Validate status code
        assertEquals(response.statusCode(), 200, "Status code should be 200");

        // Validate response contains posts
        assertTrue(response.getBody().asString().contains("\"userId\": 1"),
                "Response should contain posts for userId = 1");
    }
}



