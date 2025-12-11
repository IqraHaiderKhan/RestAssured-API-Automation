package framework.client;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;
import framework.utils.LoggerUtil;

public class ApiClient {

    private final String baseUrl;

    public ApiClient() {
        this.baseUrl = ConfigReader.get("base.url");

        LoggerUtil.log("API Client Initialized");
        LoggerUtil.log("Base URL: " + baseUrl);
    }

    // GET request
    public Response get(String endpoint) {

        LoggerUtil.log("GET Request -> " + baseUrl + "/" + endpoint);

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();

        LoggerUtil.log("Status Code: " + response.statusCode());
        LoggerUtil.log("Response: " + response.asString());

        return response;
    }

    // POST request
    public Response post(String endpoint, Object body) {

        LoggerUtil.log("POST Request -> " + baseUrl + "/" + endpoint);
        LoggerUtil.log("Request Body -> " + body.toString());

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(baseUrl + "/" + endpoint)
                .then()
                .extract()
                .response();

        LoggerUtil.log("Status Code: " + response.statusCode());
        LoggerUtil.log("Response: " + response.asString());

        return response;
    }
}







