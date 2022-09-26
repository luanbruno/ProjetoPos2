package br.infnet.proj.apiclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableJpaRepositories
@SpringBootApplication
@EnableDiscoveryClient
public class ApiClientesApplication {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() { return new RestTemplate() ;}
	public static void main(String[] args) {
		SpringApplication.run(ApiClientesApplication.class, args);
	}

}
