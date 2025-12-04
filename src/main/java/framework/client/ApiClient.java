package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;

public class ApiClient {

    private final String baseUrl;
    private final int timeout;

    public ApiClient() {
        this.baseUrl = ConfigReader.get("base.url");
        this.timeout = Integer.parseInt(ConfigReader.get("timeout"));
    }

    // GET request
    public Response get(String endpoint) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();
    }

    // POST request (this was missing)
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
}




