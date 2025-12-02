package framework.base;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import utils.ConfigReader;

public class BaseTest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = ConfigReader.get("base.url");

        // Allow HTTPS calls without strict SSL validation
        RestAssured.useRelaxedHTTPSValidation();
    }
}







