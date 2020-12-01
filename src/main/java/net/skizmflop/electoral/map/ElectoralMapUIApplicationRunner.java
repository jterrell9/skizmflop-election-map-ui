package net.skizmflop.electoral.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("net.skizmflop")
@EnableEurekaClient
@Configuration
public class ElectoralMapUIApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElectoralMapUIApplicationRunner.class, args);
	}
	
	@Bean
	public int getInt() {
		return 0;
	}
}
