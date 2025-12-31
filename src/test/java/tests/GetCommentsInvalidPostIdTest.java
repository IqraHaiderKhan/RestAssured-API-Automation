package tests;

import framework.client.ApiClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCommentsInvalidPostIdTest {

    @Test
    public void testGetCommentsWithInvalidPostId() {
        ApiClient client = new ApiClient();

        Response response = client.get("posts/99999/comments");

        assertEquals(200, response.statusCode());

        // JSONPlaceholder returns empty list for invalid postId
        int size = response.jsonPath().getList("$").size();
        assertEquals(0, size);
    }
}






