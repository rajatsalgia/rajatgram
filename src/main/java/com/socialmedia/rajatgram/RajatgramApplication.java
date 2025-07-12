package com.socialmedia.rajatgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration()
@EnableMongoRepositories(basePackages = "com.socialmedia.rajatgram.repo")
@ComponentScan(basePackages = "com.socialmedia.rajatgram")
public class RajatgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(RajatgramApplication.class, args);
	}

}
