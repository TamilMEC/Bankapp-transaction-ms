package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BankappTransactionMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankappTransactionMsApiApplication.class, args);
	}

}
