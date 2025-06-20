package tests.api2;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

//https://fakestoreapi.in/docs

public class SimpleApiTest2 {
    String base_url = "https://fakestoreapi.in/api/users";
    @Test
    public void getAllUsersTest() {
        given().get("https://fakestoreapi.in/api/users")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void getSingleUserTest() {
        int userId = 10;
        given().pathParam("userid", userId)
                .get("https://fakestoreapi.in/api/users/{userid}")
                .then()
                .log().all()
                .body("user.id", equalTo(userId));
    }

    @Test
    public void getAllUsersWithLimit5() {
        int limitSize = 2;
        given().queryParam("limit", limitSize)
                .get(base_url)
                .then()
                .log().all()
                .body("users.address", hasSize(2))
                .statusCode(200);
    }

    @Test
    public void getUsersWithPagination() {
        int pageUser = 3;
        given().queryParam("page", pageUser)
                .get(base_url)
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void getAllUsersSortByDescParam() {
        String sortBy = "desc";
        Response sortedResponse = given()
                .queryParam("sort", sortBy)
                .get(base_url)
                .then()
                .log().all()
                .extract().response();

        Response nonSortedResponse = given()
                .get(base_url)
                .then()
                .extract()
                .response();

        List<Integer> sortedResponseIds = sortedResponse.jsonPath().getList("users.id");
        List<Integer> nonSortedResponseIds = nonSortedResponse.jsonPath().getList("users.id");

        List<Integer> sortedByCode = nonSortedResponseIds
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Assertions.assertNotEquals(sortedResponseIds, nonSortedResponseIds);
        Assertions.assertEquals(sortedByCode, sortedResponseIds);
    }
}
