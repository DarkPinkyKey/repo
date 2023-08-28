package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
public class diapo_219 {

    public static void main(String[] args) {
        SpringApplication.run(diapo_219.class, args);
    }

    @RestController
    public static class RandomController {

        @GetMapping("/random-result")
        public ResponseEntity<String> getRandomResult() {
            Random random = new Random();
            int result = random.nextInt(2); // Genera un número aleatorio entre 0 y 1

            if (result == 0) {
                return new ResponseEntity<>("Resultado: 0", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Resultado: 1", HttpStatus.NOT_FOUND);
            }
        }
    }
}
