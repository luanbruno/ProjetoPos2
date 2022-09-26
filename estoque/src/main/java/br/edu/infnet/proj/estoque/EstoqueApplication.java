package br.edu.infnet.proj.estoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableJpaRepositories
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EstoqueApplication {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() { return new RestTemplate() ;}
	public static void main(String[] args) {
		SpringApplication.run(EstoqueApplication.class, args);
	}

}
