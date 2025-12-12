package tests;

import base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetPhotosTest extends BaseTest {

    @Test
    public void testGetPhotos() {
        Response response = RestAssured
                .given()
                .when()
                .get("/photos");

        assertEquals(200, response.getStatusCode());
    }
}


