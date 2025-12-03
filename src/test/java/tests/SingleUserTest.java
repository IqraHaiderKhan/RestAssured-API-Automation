package tests;

import framework.base.BaseTest;
import framework.validators.ResponseValidator;
import io.restassured.response.Response;
import org.junit.Test;

public class SingleUserTest extends BaseTest {

    @Test
    public void testSingleUser() {
        Response response = apiClient.get("users/1");

        ResponseValidator.validateStatusCode(response, 200);
        ResponseValidator.validateField(response, "id", 1);
        ResponseValidator.validateField(response, "username", "Bret");
    }
}



