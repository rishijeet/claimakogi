package com.redhat;

import org.junit.jupiter.api.Test;
import org.kie.dmn.api.core.DMNContext;
import org.kie.dmn.api.core.DMNResult;
import org.kie.dmn.api.core.DMNRuntime;
import org.kie.dmn.core.util.KieHelper;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
