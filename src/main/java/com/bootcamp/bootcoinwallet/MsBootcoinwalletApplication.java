package com.bootcamp.bootcoinwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsBootcoinwalletApplication {

	public static void main(String[] args) {
		System.setProperty("jdk.tls.client.protocols","TLSv1.2");
		SpringApplication.run(MsBootcoinwalletApplication.class, args);
	}

}
