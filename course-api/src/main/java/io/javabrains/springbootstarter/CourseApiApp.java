package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// tells spring that this a spring application 
@SpringBootApplication
public class CourseApiApp {
	
	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class,args);
		
		
	}

}
