package personal.com.adabny.apiTests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import personal.com.adabny.base.BaseAPITest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductsAPITests extends BaseAPITest {
    @Test
    public void testGetProductsList() {
        Response response =
                given()
                        .when()
                        .get("/api/products")
                        .then()
                        .statusCode(200)
                        .extract().response();

        response.then().body("products[0]._id", notNullValue());
        response.then().body("products[0].name", notNullValue());
        response.then().body("products[0].brand", notNullValue());
        response.then().body("products[0].price", greaterThan(0f));
        response.then().body("products[0].countInStock", greaterThanOrEqualTo(0));
    }
}
