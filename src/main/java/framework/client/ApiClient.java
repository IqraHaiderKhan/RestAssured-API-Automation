package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;

public class ApiClient {

    private final String baseUrl;

    public ApiClient() {
        this.baseUrl = ConfigReader.get("base.url");
    }

    public Response get(String endpoint) {
        return given()
                .baseUri(baseUrl)
                .accept(ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }
}



