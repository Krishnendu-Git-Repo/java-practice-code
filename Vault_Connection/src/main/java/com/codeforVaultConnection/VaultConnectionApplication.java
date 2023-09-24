package com.codeforVaultConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class VaultConnectionApplication implements CommandLineRunner {
	
	private Logger logger= LoggerFactory.getLogger(VaultConnectionApplication.class);
	private Credential credential;

	public VaultConnectionApplication(Credential credential) {
		super();
		this.credential = credential;
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("username : "+credential.getUsername());
		logger.info("password : "+credential.getPassword());

	}

}
