package tests;

import framework.base.BaseTest;
import framework.client.ApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserListTest extends BaseTest {

    ApiClient api = new ApiClient();

    @Test
    public void testGetUserList() {
        Response response = api.get("/users");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0);
    }
}




