package framework.utils;

import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResponseTimeValidator {

    private ResponseTimeValidator() {
        // Utility class
    }

    public static void assertResponseTimeLessThan(Response response, long maxTimeInMillis) {
        long responseTime = response.time();

        assertTrue(
                responseTime < maxTimeInMillis,
                "Expected response time < " + maxTimeInMillis +
                        " ms but was " + responseTime + " ms"
        );
    }
}







