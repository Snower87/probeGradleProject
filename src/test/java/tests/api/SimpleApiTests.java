package tests.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SimpleApiTests {

    @Test
    public void getAllUsersTest() {
        int userId = 2;
        given().pathParam("userId", userId)
                .get("https://restful-booker.herokuapp.com/booking/{userId}")
                .then()
                .log().all()
                .statusCode(200);
    }
}
