package com.certi.demo.service.impl;

import com.certi.demo.service.NumeroPorExtensoService;
import org.springframework.stereotype.Service;

@Service
public class NumeroPorExtensoServiceImpl implements NumeroPorExtensoService {

    @Override
    public String getNumeroPorExtenso(Long numeroEntrada) {

        String numeroExtenso = null;

        if(numeroEntrada == null){
            throw new IllegalStateException("É obrigatório informar um número válido.");
        }

        switch (numeroEntrada.intValue()){
            // números básicos de -10 a 10 vou tratar em switch case, para o restante aplica-se o algoritmo genérico
            case -1: numeroExtenso = "menos um"; break;
            case -2: numeroExtenso = "menos dois"; break;
            case -3: numeroExtenso = "menos três"; break;
            case -4: numeroExtenso = "menos quatro"; break;
            case -5: numeroExtenso = "menos cinco"; break;
            case -6: numeroExtenso = "menos seis"; break;
            case -7: numeroExtenso = "menos sete"; break;
            case -8: numeroExtenso = "menos oito"; break;
            case -9: numeroExtenso = "menos nove"; break;
            case -10: numeroExtenso = "menos dez"; break;
            case 0: numeroExtenso = "zero"; break;
            case 1: numeroExtenso = "um"; break;
            case 2: numeroExtenso = "dois"; break;
            case 3: numeroExtenso = "três"; break;
            case 4: numeroExtenso = "quatro"; break;
            case 5: numeroExtenso = "cinco"; break;
            case 6: numeroExtenso = "seis"; break;
            case 7: numeroExtenso = "sete"; break;
            case 8: numeroExtenso = "oito"; break;
            case 9: numeroExtenso = "nove"; break;
            case 10: numeroExtenso = "dez"; break;
            default: numeroExtenso = null;
        }

        return numeroExtenso;
    }
}
