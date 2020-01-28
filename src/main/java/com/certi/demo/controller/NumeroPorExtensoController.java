package com.certi.demo.controller;

import com.certi.demo.service.NumeroPorExtensoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroPorExtensoController {

    @Autowired
    NumeroPorExtensoService numeroPorExtensoService;

    @GetMapping(path = "/{numeroEntrada}")
    public String getNumeroPorExtenso(@PathVariable(required = true) Long numeroEntrada){
        return numeroPorExtensoService.getNumeroPorExtenso(numeroEntrada);
    }
}
