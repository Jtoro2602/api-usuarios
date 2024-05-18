package cl.prueba.pruebajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cl.prueba.pruebajava"})
public class ClPruebaJava {

	public static void main(String[] args) {
		SpringApplication.run(ClPruebaJava.class, args);
	}

}
