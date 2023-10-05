package com.example.demo.controllers;

import com.example.demo.Car;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCar() throws Exception {
        mockMvc.perform(get("/car"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"light\":{\"frontLightStatus\":false,\"frontLightMode\":\"HALF\",\"backLightStatus\":false},\"engine\":{\"engineStatus\":false}}"));
    }

    @Test
    void getCarInvalidEndpoint() throws Exception {
        mockMvc.perform(get("/invalidEndpoint"))
                .andExpect(status().isNotFound());
    }
}