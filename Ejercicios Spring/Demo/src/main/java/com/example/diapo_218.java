package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class diapo_218 {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Persona persona = new Persona("John Doe", 30);

        try {
            // TextJSON
            String jsonString = objectMapper.writeValueAsString(persona);
            System.out.println("TextJSON:");
            System.out.println(jsonString);

            // Escrito en formato de String con produces
            String jsonStringProduces = "{\"nombre\":\"" + persona.getNombre() + "\",\"edad\":" + persona.getEdad() + "}";
            System.out.println("String con produces:");
            System.out.println(jsonStringProduces);

            // ResponseEntity
            ResponseEntity<Persona> responseEntity = new ResponseEntity<>(persona, HttpStatus.OK);
            System.out.println("ResponseEntity:");
            System.out.println(responseEntity.getBody());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL) 
    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }
}

