package framework.utils;

import io.restassured.response.Response;

public class ResponseValidator {

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        int actual = response.getStatusCode();
        if (actual != expectedStatusCode) {
            throw new AssertionError(
                "Expected status code: " + expectedStatusCode + ", but got: " + actual
            );
        }
    }

    public static void validateResponseTime(Response response, long maxResponseTimeMs) {
        long actual = response.getTime();
        if (actual > maxResponseTimeMs) {
            throw new AssertionError(
                "Expected response time < " + maxResponseTimeMs +
                " ms, but got: " + actual + " ms"
            );
        }
    }
}




