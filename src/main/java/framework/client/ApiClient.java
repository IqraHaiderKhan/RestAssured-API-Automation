package framework.client;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ApiClient {

    public Response get(String endpoint) {
        return given()
                .log().all()
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }
}

