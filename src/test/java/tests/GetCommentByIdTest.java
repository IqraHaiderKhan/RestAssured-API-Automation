package tests;

import framework.base.BaseTest;
import framework.client.ApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCommentByIdTest extends BaseTest {

    ApiClient api = new ApiClient();

    @Test
    public void testGetCommentById() {
        Response response = api.get("/comments/1");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
    }
}




