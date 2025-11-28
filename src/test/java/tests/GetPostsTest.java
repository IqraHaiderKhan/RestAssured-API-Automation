package tests;

import framework.base.BaseTest;
import framework.client.ApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPostsTest extends BaseTest {

    ApiClient api = new ApiClient();

    @Test
    public void testGetPosts() {
        Response response = api.get("/posts");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0);
    }
}



