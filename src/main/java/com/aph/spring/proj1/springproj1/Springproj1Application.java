package com.aph.spring.proj1.springproj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.aph.spring.proj1")
public class Springproj1Application {

	public static void main(String[] args) {
		// SpringApplication.run(Springproj1Application.class, args);
		SpringApplication app = new SpringApplication(Springproj1Application.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

}
