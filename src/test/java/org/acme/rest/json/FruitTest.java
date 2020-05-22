package org.acme.rest.json;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.acme.rest.testresource.FruitTestResource;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(FruitTestResource.class)
public class FruitTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/fruits")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}