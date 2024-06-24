package com.game.indie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SoulsdleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoulsdleApplication.class, args);
	}

}
