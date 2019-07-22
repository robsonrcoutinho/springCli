package br.com.robsonc.springCli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
public class SpringCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCliApplication.class, args);
	}

}
