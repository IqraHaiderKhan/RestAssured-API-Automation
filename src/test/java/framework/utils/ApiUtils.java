package framework.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    /**
     * Performs a GET request
     */
    public static Response get(String endpoint) {
        return given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Performs a GET request with path param (e.g., /users/{id})
     */
    public static Response get(String endpoint, int id) {
        return given()
                .pathParam("id", id)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Performs a POST request
     */
    public static Response post(String endpoint, String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Performs a PUT request
     */
    public static Response put(String endpoint, int id, String body) {
        return given()
                .pathParam("id", id)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Performs a DELETE request
     */
    public static Response delete(String endpoint, int id) {
        return given()
                .pathParam("id", id)
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}

