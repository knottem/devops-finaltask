package com.example.demo.controllers;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class CalculatorControllerSystemTestSystem {

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }

    @Test
    void shouldReturnCorrectSumForAddition() {
        given()
                .when()
                .get("/calculate/5/3/add")
                .then()
                .statusCode(200)
                .assertThat()
                .body(equalTo("8"));
    }

    @Test
    void shouldReturnCorrectDifferenceForSubtraction() {
        given()
                .when()
                .get("/calculate/5/3/subtract")
                .then()
                .statusCode(200)
                .assertThat()
                .body(equalTo("2"));
    }

    @Test
    void shouldReturnCorrectProductForMultiplication() {
        given()
                .when()
                .get("/calculate/5/3/multiply")
                .then()
                .statusCode(200)
                .assertThat()
                .body(equalTo("15"));
    }

    @Test
    void shouldReturnCorrectQuotientForDivision() {
        given()
                .when()
                .get("/calculate/6/3/divide")
                .then()
                .statusCode(200)
                .assertThat()
                .body(equalTo("2"));
    }

    @Test
    void shouldReturnZeroForInvalidOperator() {
        given()
                .when()
                    .get("/calculate/5/3/invalidOperator")
                .then()
                .statusCode(200)
                .assertThat()
                .body(equalTo("0"));
    }

}
