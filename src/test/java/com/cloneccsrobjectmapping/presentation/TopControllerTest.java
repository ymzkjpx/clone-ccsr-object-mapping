package com.cloneccsrobjectmapping.presentation;

import com.cloneccsrobjectmapping.CcsrTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@CcsrTest
@AutoConfigureMockMvc
class TopControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void トップ画面が表示できる() throws Exception{
        mockMvc.perform(get("/")).andExpect(status().is3xxRedirection());
    }

}