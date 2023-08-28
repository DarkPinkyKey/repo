package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        LOGGER.trace("This is a TRACE message.");
        LOGGER.debug("This is a DEBUG message.");
        LOGGER.info("This is an INFO message.");
        LOGGER.warn("This is a WARN message.");
        LOGGER.error("This is an ERROR message.");
    }
}

