package framework.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecFactory {

    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";

    private RequestSpecFactory() {
        // prevent instantiation
    }

    public static RequestSpecification getDefaultRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setContentType(ContentType.JSON)
                .addHeader("Accept", "application/json")
                .log(io.restassured.filter.log.LogDetail.ALL)
                .build();
    }
}










