package framework.client;

import static io.restassured.RestAssured.given;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import framework.utils.ConfigReader;
import io.restassured.http.ContentType;
import framework.utils.RequestSpecBuilderUtil;
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
        .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .spec(RequestSpecBuilderUtil.buildBaseSpec(baseUrl))
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    // GET request with query params
public Response getWithQueryParams(String endpoint, Map<String, Object> queryParams) {
    return given()
        .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
            .contentType(ContentType.JSON)
            .queryParams(queryParams)
            .when()
            .get(baseUrl + "/" + endpoint)
            .then()
            .extract()
            .response();
}


    // POST request (default)
    public Response post(String endpoint, Object body) {
        return given()
        .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    // POST request with headers
    public Response post(String endpoint, Object body, Map<String, String> headers) {
        return given()
        .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }
}










