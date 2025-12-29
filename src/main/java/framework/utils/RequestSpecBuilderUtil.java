package framework.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;

import java.util.Map;

public class RequestSpecBuilderUtil {

    private RequestSpecBuilderUtil() {
        // utility class
    }

    public static RequestSpecification defaultSpec(String baseUrl) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification specWithHeaders(String baseUrl, Map<String, String> headers) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .addHeaders(headers)
                .build();
    }
}





