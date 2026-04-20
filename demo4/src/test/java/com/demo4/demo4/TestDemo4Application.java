package com.demo4.demo4;

import org.springframework.boot.SpringApplication;

public class TestDemo4Application {

	public static void main(String[] args) {
		SpringApplication.from(Demo4Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
