package com.expensemgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.expensemgr.controllers","com.expensemgr.services"})
@EntityScan(basePackages = {"com.expensemgr.entity"})
@EnableJpaRepositories(basePackages = {"com.expensemgr.repositories"})
public class ExpenseManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagerApplication.class, args);
	}

}
