package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTestIntegration {


    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnSumForAddOperator() throws Exception {
        mockMvc.perform(get("/calculate/5/3/add"))
                .andExpect(status().isOk())
                .andExpect(content().string("8"));
    }

    @Test
    void shouldReturnDifferenceForSubtractOperator() throws Exception {
        mockMvc.perform(get("/calculate/5/3/subtract"))
                .andExpect(status().isOk())
                .andExpect(content().string("2"));
    }

    @Test
    void shouldReturnProductForMultiplyOperator() throws Exception {
        mockMvc.perform(get("/calculate/5/3/multiply"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }

    @Test
    void shouldReturnQuotientForDivideOperator() throws Exception {
        mockMvc.perform(get("/calculate/6/3/divide"))
                .andExpect(status().isOk())
                .andExpect(content().string("2"));
    }

}
