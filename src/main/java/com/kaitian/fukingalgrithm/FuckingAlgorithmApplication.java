package com.kaitian.fukingalgrithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class FuckingAlgorithmApplication {

	public static void main(String[] args) {
		Random r=new Random();
		Integer res=r.nextInt(3);
		SpringApplication.run(FuckingAlgorithmApplication.class, args);
	}

}
