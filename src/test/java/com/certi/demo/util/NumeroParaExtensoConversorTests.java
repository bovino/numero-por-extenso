package com.certi.demo.util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroParaExtensoConversorTests {

    @Test
    void testNumeroParaExtensoConversor() throws Exception {
        NumeroParaExtensoConversor conversor = new NumeroParaExtensoConversor();
        Long value = 0L;
        Long value2 = 1L;
        Long value3 = 1000000000000L;
        assertEquals("zero", conversor.getExtenso(""+Math.abs(value.longValue())));
        assertEquals("um", conversor.getExtenso(""+Math.abs(value2.longValue())));
        assertEquals("um trilhão", conversor.getExtenso(""+Math.abs(value3.longValue())));
    }
}
