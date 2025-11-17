package tests;

import framework.client.ApiClient;
import framework.endpoints.UserEndpoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void testGetUsers() {
        Response response = ApiClient.get(UserEndpoints.GET_USERS);

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}

