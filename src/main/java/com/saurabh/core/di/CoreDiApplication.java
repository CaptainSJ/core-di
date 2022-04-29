package com.saurabh.core.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.Context;


@SpringBootApplication
public class CoreDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreDiApplication.class, args);
	}
}
