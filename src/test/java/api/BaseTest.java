package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {

    @BeforeEach
    public void setup(){
        RestAssured.baseURI = "https://bookcart.azurewebsites.net";
    }

    @Test
    public void getAllBooks() {
        RestAssured.when().get("/api/Book")
                .then()
                .statusCode(200)
                .log().all();
    }


}
