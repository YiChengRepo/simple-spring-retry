package com.yi.cheng.java.springretrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;

@SpringBootApplication
@EnableRetry
public class SpringRetryDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRetryDemoApplication.class, args);
	}


}
