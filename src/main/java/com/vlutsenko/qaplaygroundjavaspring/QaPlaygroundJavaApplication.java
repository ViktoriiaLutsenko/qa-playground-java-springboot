package com.vlutsenko.qaplaygroundjavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.vlutsenko.qaplaygroundjavaspring", "com.vlutsenko.framework"})
public class QaPlaygroundJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QaPlaygroundJavaApplication.class, args);
	}

}
