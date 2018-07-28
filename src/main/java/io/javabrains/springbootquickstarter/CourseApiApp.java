package io.javabrains.springbootquickstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// annotation para que el proyecto use spring
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// el metodo que hace que  se ejecute y pueda levantar el servidor por default puerto 8080
		SpringApplication.run(CourseApiApp.class, args);
	}

}
