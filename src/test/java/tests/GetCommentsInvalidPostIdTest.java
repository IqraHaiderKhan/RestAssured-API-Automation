package tests.comments;

import org.junit.jupiter.api.Test;

import framework.client.ApiClient;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.is;

public class GetCommentsInvalidPostIdTest {

    @Test
    public void testGetCommentsWithInvalidPostId() {
        ApiClient client = new ApiClient();

        Response response = client.get("/posts/99999/comments");

        // JSONPlaceholder returns ALL comments, not empty list
        response.then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("size()", is(500));
    }
}




