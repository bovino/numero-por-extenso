package com.certi.demo.controller;

import com.certi.demo.service.NumeroPorExtensoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroPorExtensoControllerTests extends AbstractControllerTest {

    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    private final static Integer SUCCESS_STATUS = 200;

    @MockBean
    NumeroPorExtensoService numeroPorExtensoService;

    @Autowired
    protected WebApplicationContext context;

    @Test
    void testGetProductsForProductManager() throws Exception {
        RequestBuilder postBuilder = MockMvcRequestBuilders.get("/1");
        Integer returnStatus = mvc.perform(postBuilder).andReturn().getResponse().getStatus();
        assertEquals(SUCCESS_STATUS, returnStatus);
    }

}
