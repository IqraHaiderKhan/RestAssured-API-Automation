package tests;

import framework.client.ApiClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCommentsInvalidQueryParamTest {

    @Test
    public void testGetCommentsWithInvalidPostIdQueryParam() {
        ApiClient client = new ApiClient();

        Map<String, Object> queryParams = Map.of("postId", 99999);

        Response response = client.get("comments", queryParams);

        assertEquals(200, response.statusCode(),
                "Expected HTTP 200 for invalid postId query param");

        int size = response.jsonPath().getList("$").size();
        assertEquals(0, size,
                "Expected empty comments list for invalid postId");
    }
}





