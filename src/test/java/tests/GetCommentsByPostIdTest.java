package tests;

import framework.base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GetCommentsByPostIdTest extends BaseTest {

    @Test
    public void testGetCommentsByPostId() {
        int postId = 1;

        Response response = apiClient.get("posts/" + postId + "/comments");

        assertEquals(response.statusCode(), 200, "Status code mismatch!");
    }
}


