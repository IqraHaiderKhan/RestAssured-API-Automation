package framework.base;

import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import utils.ConfigReader;

public class BaseTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigReader.getBaseUrl();
    }
}



