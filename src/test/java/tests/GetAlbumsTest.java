package tests;

import framework.base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GetAlbumsTest extends BaseTest {

    @Test
    public void testGetAlbums() {

        Response response = apiClient.get("albums");

        assertEquals(response.statusCode(), 200, "Status code should be 200");
    }
}





