package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootThymeleafEmployeeSep30Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafEmployeeSep30Application.class, args);
	}

}
