package ch.wertal.viennabackendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViennaBackendApiApplication implements Runnable {

	public static void main(String[] args) {
		SpringApplication.run(ViennaBackendApiApplication.class, args);
	}


	@Override
	public void run() {
		System.out.println("Here we go..------------------------------------------------.");
	}
}
