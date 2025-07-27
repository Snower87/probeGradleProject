package tests.PortalAPITests.Integration.Integration1C;

import models.integrationModels.Models1C.Answer1Cgetunit;
import models.integrationModels.Models1C.DataItem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Integration1CTests {
    @Test
    public void test1() {
        given().auth()
                .basic("Http_serv", "e!8nmnz@TzicN^L")
                .get("https://bkswd-1s-iis.cifra.works/ffinbank-zup-test/hs/getunit/getunit")
                .then().statusCode(200)
                .extract().as(Answer1Cgetunit.class);
                //.log().all();
    }

    @Test
    public void testAllListDepartments() {
        List<DataItem> dataItemList = given().auth()
                .basic("Http_serv", "e!8nmnz@TzicN^L")
                .get("https://bkswd-1s-iis.cifra.works/ffinbank-zup-test/hs/getunit/getunit")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath().getList("data", DataItem.class);

        System.out.println(dataItemList.get(0));
    }

    //Проверяем:
    //401 - отсутствие авторизации (нету токена)

}
