package framework.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification requestSpec;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = "https://reqres.in";

        // Timeouts set here (5000 ms)
        RestAssuredConfig config = RestAssured.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam("http.connection.timeout", 5000)
                        .setParam("http.socket.timeout", 5000)
                        .setParam("http.connection-manager.timeout", 5000)
                );

        requestSpec = new RequestSpecBuilder()
                .setConfig(config)
                .setBaseUri(RestAssured.baseURI)
                .setContentType("application/json")
                .build();
    }
}


