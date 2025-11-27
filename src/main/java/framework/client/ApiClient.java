package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class ApiClient {

    public Response get(String endpoint) {
        return given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }
}
