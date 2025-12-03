package framework.validators;

import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ResponseValidator {

    public static void validateStatusCode(Response response, int expectedStatus) {
        assertThat("Status code mismatch", response.getStatusCode(), equalTo(expectedStatus));
    }

    public static void validateField(Response response, String jsonPath, Object expectedValue) {
        Object actualValue = response.jsonPath().get(jsonPath);
        assertThat("Field value mismatch at: " + jsonPath, actualValue, equalTo(expectedValue));
    }

    public static void validateArraySize(Response response, String jsonPath, int expectedSize) {
        int actualSize = response.jsonPath().getList(jsonPath).size();
        assertThat("Array size mismatch at: " + jsonPath, actualSize, equalTo(expectedSize));
    }

    // Placeholder for future schema validation
    public static void validateSchema(Response response, String schemaPath) {
        // implement later with RestAssured JSON schema validator
    }
}








