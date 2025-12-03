package tests;

import framework.base.BaseTest;
import framework.validators.ResponseValidator;
import io.restassured.response.Response;
import org.junit.Test;

public class ListUsersTest extends BaseTest {

    @Test
    public void testListUsers() {
        Response response = apiClient.get("users");

        ResponseValidator.validateStatusCode(response, 200);
        ResponseValidator.validateArraySize(response, "$", 10);
    }
}



