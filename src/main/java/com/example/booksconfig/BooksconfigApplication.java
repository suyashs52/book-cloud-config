package com.example.booksconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BooksconfigApplication {
	//url: http://localhost:8888/licensingservice/default
	public static void main(String[] args) {
		SpringApplication.run(BooksconfigApplication.class, args);
	}

}
