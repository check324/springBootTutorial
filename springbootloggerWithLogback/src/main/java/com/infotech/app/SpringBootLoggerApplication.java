package com.infotech.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLoggerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLoggerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
		LOGGER.error("Message loggered at error level");
		LOGGER.warn("Message loggered at warn level");
		LOGGER.info("Message loggered at info level");
		LOGGER.debug("Message loggered at debug level");

	}

	@RequestMapping("/")
	public String wellcome(){
		throw new RuntimeException("Opps exception has occured");
		//return "Hello world!";
	}
}
