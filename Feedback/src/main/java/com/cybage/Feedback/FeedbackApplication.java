package com.cybage.Feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com.cybage")

@EnableJpaRepositories(basePackages="com.cybage.repository")
@EntityScan(basePackages="com.cybage.model")
public class FeedbackApplication {

	public static void main(String[] args) {

		SpringApplication.run(FeedbackApplication.class, args);
		System.out.println("Feedback - API  portNo: 8081");
	}

}
