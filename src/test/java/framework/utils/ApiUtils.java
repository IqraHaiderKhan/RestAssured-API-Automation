package framework.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtils {

    public static Response get(String endpoint) {
        return RestAssured.given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response post(String endpoint, String body) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response put(String endpoint, String body) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response delete(String endpoint) {
        return RestAssured.given()
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}
