package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class diapo_235{

    // Ejercicio 1: localhost:8080/api/v1/hacercafe
    @GetMapping("/hacercafe")
    @ResponseStatus(HttpStatus.OK)
    public String hacerCafe() {
        return "Se ha hecho el café satisfactoriamente!";
    }

    // Ejercicio 2: localhost:8080/api/v1/hacerte
    @GetMapping("/hacerte")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String hacerte() {
        return "Soy una tetera!";
    }

    // Ejercicio 3: localhost:8080/api/v1/notfound
    @GetMapping("/notfound")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "Not found";
    //Apuntes para entender mejor los ejercicios//
     /*Cuando @GetMapping este en la misa linea que otro tipo este no sera compatible a menos que sea */
    }
}
