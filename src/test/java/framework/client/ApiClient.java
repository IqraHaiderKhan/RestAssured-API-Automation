package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;

public class ApiClient {

    static {
        // Load base URL from config.properties
        io.restassured.RestAssured.baseURI = ConfigReader.getBaseUrl();
    }

    // ------------ GET ------------
    public static Response get(String endpoint) {
        return given()
                .log().all()
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response get(String endpoint, Object pathParam) {
        return given()
                .log().all()
                .pathParam("id", pathParam)
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    // ------------ POST ------------
    public static Response post(String endpoint, Object body) {
        return given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    // ------------ PUT ------------
    public static Response put(String endpoint, Object pathParam, Object body) {
        return given()
                .log().all()
                .pathParam("id", pathParam)
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    // ------------ DELETE ------------
    public static Response delete(String endpoint, Object pathParam) {
        return given()
                .log().all()
                .pathParam("id", pathParam)
                .when()
                .delete(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
