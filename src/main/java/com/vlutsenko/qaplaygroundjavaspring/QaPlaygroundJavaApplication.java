package com.vlutsenko.qaplaygroundjavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.vlutsenko.qaplaygroundjavaspring", "com.vlutsenko.framework"})
@EnableJpaRepositories(basePackages = "com.vlutsenko.qaplaygroundjavaspring.page.multileveldropdown.repository")
public class QaPlaygroundJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QaPlaygroundJavaApplication.class, args);
    }

}
