package framework.utils;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestLogger {

    public static RequestSpecification loggedRequest() {
        return given()
                .filter(new RequestLoggingFilter())
                .filter(new ResponseLoggingFilter());
    }
}


