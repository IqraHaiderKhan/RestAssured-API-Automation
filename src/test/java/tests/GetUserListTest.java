package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.base.BaseTest;
import framework.client.ApiClient;
import io.restassured.response.Response;

public class GetUserListTest extends BaseTest {

    ApiClient api = new ApiClient();

    @Test
    public void testGetUserList() {
        Response response = api.get("/api/users?page=2");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("data").size() > 0);
    }
}



