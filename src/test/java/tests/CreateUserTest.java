package tests;

import framework.base.BaseTest;
import framework.data.UserDataFactory;
import framework.model.User;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateUserTest extends BaseTest {

    @Test
    public void createUserTest() {
        User user = UserDataFactory.createValidUser();

        Response response = apiClient.post("users", user);

        assertEquals(201, response.getStatusCode());
        assertEquals(user.getName(), response.jsonPath().getString("name"));
    }
}



