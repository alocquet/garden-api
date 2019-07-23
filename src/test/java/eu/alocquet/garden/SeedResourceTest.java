package eu.alocquet.garden;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SeedResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/seeds")
          .then()
             .statusCode(200);
    }

}