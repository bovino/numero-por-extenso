package com.certi.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NumeroPorExtensoServiceImplTests {

    @Autowired
    NumeroPorExtensoService service;

    @Test
    void serviceTestSupportingBothNegativasAndPositives() throws Exception {
        String retorno = service.getNumeroPorExtenso(-1L);
        String retorno2 = service.getNumeroPorExtenso(1L);
        String retorno3 = service.getNumeroPorExtenso(-1000000000000L);
        String retorno4 = service.getNumeroPorExtenso(1000000000000L);
        assertEquals("menos um", retorno);
        assertEquals("um", retorno2);
        assertEquals("menos um trilhão", retorno3);
        assertEquals("um trilhão", retorno4);
    }
}
