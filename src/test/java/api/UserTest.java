package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest extends BaseTest {

    @Test
    public void registerNewUser() {
        RestAssured.given()
                .contentType("application/json")
                .body("""
                        {
                           "firstName": "George",
                           "lastName": "007",
                           "username": "George9",
                           "password": "Test123*",
                           "confirmPassword": "Test123*",
                           "gender": "Female"
                         }
                        """)
                .when().post("/api/User")
                .then().statusCode(200)
                .log().all();
    }

    @Test
    public void validateUserName() {
        RestAssured.given()
                .pathParam("userName", "Geroge9")
                .when().get("/api/User/validateUserName/{userName}")
                .then().log().all();
        Response response = RestAssured.given()
                .pathParam("userName", "Geroge9")
                .when().get("/api/User/validateUserName/{userName}");
        Assertions.assertEquals("true", response.asString());
    }

    @Test
    public void login() throws JsonProcessingException {
        RestAssured.given()
                .contentType("application/json")
                .body("""
                        {
                          "username": "George7",
                          "password": "Test123*"
                        }
                        """)
                .when().post("/api/Login")
                .then().log().all();
        Response response = RestAssured.given()
                .contentType("application/json")
                .body("""
                        {
                          "username": "George7",
                          "password": "Test123*"
                        }
                        """)
                .when().post("/api/Login");
        Assertions.assertTrue(response.asString().contains("935"));
        String jsonString = response.asString();
        // Import JACKSON DataBind + Core
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(jsonString);
        String token = node.get("token").asText();
        System.out.println("Token = " + token);
        int userId = node.get("userDetails").get("userId").asInt();
        System.out.println("UserId = " + userId);
    }

    @Test
    public void getASpecificBook() throws JsonProcessingException {
        RestAssured.given()
                .contentType("application/json")
                .pathParam("id", 3)
                .when().get("api/Book/{id}")
                .then().log().all();
        Response response = RestAssured.given()
                .contentType("application/json")
                .pathParam("id", 3)
                .when().get("api/Book/{id}");
        String jsonString = response.asString();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(jsonString);
        String bookId = node.get("bookId").asText();
        System.out.println("bookId = " + bookId);
        String title = node.get("title").asText();
        System.out.println("title = " + title);
        String author = node.get("author").asText();
        System.out.println("author = " + author);
        String category = node.get("category").asText();
        System.out.println("category = " + category);
        double price = node.get("price").asDouble();
        System.out.println("price = " + price);
        String coverFileName = node.get("coverFileName").asText();
        System.out.println("coverFileName = " + coverFileName);
    }

    @Test
    public void getCategoryList() throws JsonProcessingException {
        RestAssured.when().get("/api/Book/GetCategoriesList")
                .then().log().all();
        Response response = RestAssured.when().get("/api/Book/GetCategoriesList");
        String jsonString = response.asString();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode nodes = mapper.readTree(jsonString);
        for (JsonNode node : nodes) {
            if (node.get("categoryName").asText().equalsIgnoreCase("fiction")) {
                System.out.println("categoryId = " + node.get("categoryId").asInt());
                System.out.println("categoryName = " + node.get("categoryName").asText());
                Assertions.assertEquals(2, node.get("categoryId").asInt());
                Assertions.assertEquals("Fiction", node.get("categoryName").asText());
            }
            System.out.println(node.get("categoryId").asInt());
            System.out.println(node.get("categoryName").asText());
        }
    }
}
