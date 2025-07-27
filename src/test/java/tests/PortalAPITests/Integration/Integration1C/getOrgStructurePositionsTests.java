package tests.PortalAPITests.Integration.Integration1C;

import io.restassured.response.Response;
import models.integrationModels.Models1C.getOrgStructurePositions.ANS_1C_OrgStructurePositions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class getOrgStructurePositionsTests {
    @Test
    public void getOrgStructurePositionsTest1() {
        //{{url_1c_bank}}/{{path-zup-test-bank}}/getOrgStructurePositions/getOrgStructurePositions?unit_guid=20b2a806-92f7-11eb-a9d1-0050560348db
        String unit_guid_param = "20b2a806-92f7-11eb-a9d1-0050560348db";
        Response response = given()
                .auth()
                .basic("Http_serv", "e!8nmnz@TzicN^L")
                .queryParam("unit_guid", unit_guid_param)
                .get("https://bkswd-1s-iis.cifra.works/ffinbank-zup-test/hs/getOrgStructurePositions/getOrgStructurePositions")
                .then().log().all()
                .statusCode(200)
                .extract().response();
    }

    @Test
    public void getOrgStructurePositionsTest2() {
        String unit_guid_param = "20b2a806-92f7-11eb-a9d1-0050560348db";
        Response response = given()
                .auth()
                .basic("Http_serv", "e!8nmnz@TzicN^L")
                .queryParam("unit_guid", unit_guid_param)
                .get("https://bkswd-1s-iis.cifra.works/ffinbank-zup-test/hs/getOrgStructurePositions/getOrgStructurePositions")
                .then().log().all()
                .statusCode(200)
                .extract().response();

        //пока не знаю как здесь использовать OrgStructurePositions.unit_guid
        /*
        Response response2 = given()
                .auth()
                .basic("Http_serv", "e!8nmnz@TzicN^L")
                .queryParam("unit_guid", unit_guid_param)
                .get("https://bkswd-1s-iis.cifra.works/ffinbank-zup-test/hs/getOrgStructurePositions/getOrgStructurePositions")
                .then().log().all()
                .statusCode(200)
                .body("OrgStructurePositions.unit_guid", equalTo(unit_guid_param))
                .extract().response();
        */

        //ANS_1C_OrgStructurePositions ans1COrgStructurePositions = response.as(ANS_1C_OrgStructurePositions.class);

        //Assertions.assertEquals(unit_guid_param, ans1COrgStructurePositions.);
    }
}
