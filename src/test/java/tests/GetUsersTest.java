package tests;

import framework.client.ApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUsersTest {

    @Test
    public void testGetUserList() {
        Response response = ApiClient.get("/api/users?page=2");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testGetSingleUser() {
        Response response = ApiClient.get("/api/users/2");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}

