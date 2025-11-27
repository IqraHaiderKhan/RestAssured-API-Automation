package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;

public class ApiClient {

    private static final String BASE_URL = ConfigReader.getBaseUrl();

    public static Response get(String endpoint) {
        return given()
                .log().all()
                .baseUri(BASE_URL)
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response post(String endpoint, Object body) {
        return given()
                .log().all()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response put(String endpoint, Object body) {
        return given()
                .log().all()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL)
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response delete(String endpoint) {
        return given()
                .log().all()
                .baseUri(BASE_URL)
                .when()
                .delete(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
