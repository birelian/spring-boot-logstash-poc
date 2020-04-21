package net.birelian.logstashdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class LogstashDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(LogstashDemoApplication.class, args);
	}

	@GetMapping
	public String sayHello() {

		log.info("Saying hello!!");

		return "Hello! A log has been written";
	}

}
