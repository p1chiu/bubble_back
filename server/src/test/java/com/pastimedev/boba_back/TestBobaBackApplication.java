package com.pastimedev.boba_back;

import org.springframework.boot.SpringApplication;

public class TestBobaBackApplication {

	public static void main(String[] args) {
		SpringApplication.from(BobaBackApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
