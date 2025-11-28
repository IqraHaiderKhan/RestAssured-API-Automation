package tests;

import framework.base.BaseTest;
import framework.constants.Endpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUsersTest extends BaseTest {

    @Test
    public void testGetAllUsers() {
        Response response = RestAssured
                .given()
                .when()
                .get(Endpoints.LIST_USERS)
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testGetSingleUser() {
        Response response = RestAssured
                .given()
                .pathParam("id", 2)
                .when()
                .get(Endpoints.SINGLE_USER)
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}



