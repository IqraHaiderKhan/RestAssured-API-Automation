package tests;

import framework.base.BaseTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetCommentsInvalidPostIdTest extends BaseTest {

    @Test
    public void testGetCommentsWithInvalidPostId() {
        int invalidPostId = 9999;

        Response response = apiClient.get("posts/" + invalidPostId + "/comments");

        // JSONPlaceholder returns [] (empty array) with status 200 for missing comments
        assertEquals(200, response.statusCode());
        assertEquals("[]", response.getBody().asString().trim(), 
                "Expected empty list for invalid post ID");
    }
}

