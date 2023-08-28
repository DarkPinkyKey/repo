package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/custom-status")
    @ResponseStatus(HttpStatus.CREATED) // Cambia el status code a 201 CREATED
    public String customStatusCode() {
        return "Respuesta con status code 201";
    }
}
