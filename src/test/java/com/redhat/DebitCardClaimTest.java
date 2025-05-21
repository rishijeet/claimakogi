package com.redhat;

import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DebitCardClaimTest {

    @Test
    public void testDebitCardClaim() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"Claim\": {\"claimTimely\": true, \"highRiskTransaction\": false}}")
                .when()
                .post("/debit-card-claim")
                .then()
                .statusCode(200)
                .body("'Claim Approval Decision'", equalTo("APPROVED"));
    }
}
