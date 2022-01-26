package com.gsengage.report;

import com.gsengage.report.dto.Template;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReportResourceTest {

    @Test
    public void testAddReport() {
        given()
          .contentType(ContentType.JSON)
                .body(Template.builder().templateId("reportId").build())
          .when().post("/report/add")
          .then()
             .statusCode(201)
             .body(is("reportId"));
    }

}