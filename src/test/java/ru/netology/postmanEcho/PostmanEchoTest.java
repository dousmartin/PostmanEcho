package ru.netology.postmanEcho;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Привет")

                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Привет!"))
        ;
    }
}
