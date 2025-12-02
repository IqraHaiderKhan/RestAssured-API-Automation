package tests;

import framework.base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetAlbumsTest extends BaseTest {

    @Test
    public void testGetAlbums() {
        Response response = RestAssured
                .given()
                .when()
                .get("/albums");

        assertEquals(200, response.getStatusCode());
    }
}




