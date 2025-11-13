package tests;

import framework.config.Config;
import framework.utils.ApiUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import framework.reporting.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class UserApiTests {

    @Test
    public void getUsers_shouldReturn200() {
        Response response = ApiUtils.get(Config.BASE_URL + "/users?page=2");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void createUser_shouldReturn201() {
        String body = """
            { "name": "morpheus", "job": "leader" }
        """;
        Response response = ApiUtils.post(Config.BASE_URL + "/users", body);
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test
    public void updateUser_shouldReturn200() {
        String body = """
            { "name": "morpheus", "job": "zion resident" }
        """;
        Response response = ApiUtils.put(Config.BASE_URL + "/users/2", body);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void deleteUser_shouldReturn204() {
        Response response = ApiUtils.delete(Config.BASE_URL + "/users/2");
        Assert.assertEquals(response.getStatusCode(), 204);
    }
}
