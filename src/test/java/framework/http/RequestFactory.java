package framework.http;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestFactory {

    public static Response get(RequestSpecification req, String endpoint) {
        return req.when().get(endpoint);
    }

    public static Response post(RequestSpecification req, String endpoint, Object body) {
        return req.body(body).when().post(endpoint);
    }

    public static Response put(RequestSpecification req, String endpoint, Object body) {
        return req.body(body).when().put(endpoint);
    }

    public static Response delete(RequestSpecification req, String endpoint) {
        return req.when().delete(endpoint);
    }
}
