package com.qualifier.QualifierAnnotation.QualifierAnnotaiton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class QualifierAnnotaitonApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierAnnotaitonApplication.class, args);
	}

	@Bean
	@Primary
	public WordFileReader getWordFileReader(){
		return new WordFileReader();
	}
}
