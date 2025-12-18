package framework.client;

import static io.restassured.RestAssured.given;

import framework.utils.ConfigReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class ApiClient {

    private final String baseUrl;

    public ApiClient() {
        this.baseUrl = ConfigReader.get("base.url");
    }

    // GET request (default)
    public Response get(String endpoint) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();
    }

    // GET request with headers
    public Response get(String endpoint, Map<String, String> headers) {
        return given()
                .contentType(ContentType.JSON)
                .headers(headers)
                .when()
                .get(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();
    }

    // POST request (default)
    public Response post(String endpoint, Object body) {
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();
    }

    // POST request with headers
    public Response post(String endpoint, Object body, Map<String, String> headers) {
        return given()
                .contentType(ContentType.JSON)
                .headers(headers)
                .body(body)
                .when()
                .post(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();
    }
}









