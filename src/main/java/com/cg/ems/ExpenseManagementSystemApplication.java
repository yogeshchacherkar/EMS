package com.cg.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class ExpenseManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagementSystemApplication.class, args);
	}
}
