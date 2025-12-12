package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;

public class ApiClient {

    private final String baseUrl;

    public ApiClient() {
        this.baseUrl = ConfigReader.get("base.url");

        System.out.println("API Client Initialized");
        System.out.println("Base URL: " + baseUrl);
    }

    // GET request
    public Response get(String endpoint) {

        System.out.println("GET Request -> " + baseUrl + "/" + endpoint);

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response: " + response.asString());

        return response;
    }

    // POST request
    public Response post(String endpoint, Object body) {

        System.out.println("POST Request -> " + baseUrl + "/" + endpoint);
        System.out.println("Request Body -> " + body.toString());

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response: " + response.asString());

        return response;
    }
}








