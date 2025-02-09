package personal.com.adabny.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BaseAPITest {
    @BeforeAll
    public static void setup() {
        // Optionally set a base URI for all tests
        RestAssured.baseURI = "https://adabny.com/";
    }

}
