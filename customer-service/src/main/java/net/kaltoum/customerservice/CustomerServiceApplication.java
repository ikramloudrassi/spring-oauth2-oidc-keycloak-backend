package net.kaltoum.customerservice;

import net.kaltoum.customerservice.entities.Customer;
import net.kaltoum.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner start(CustomerRepository customerRepository){
		return args ->{
			customerRepository.save(Customer.builder()
							.name("kaltoum")
							.email("kaltoum@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
							.name("ahmiti")
							.email("ahmiti@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
							.name("aaaa")
							.email("aaa@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
							.name("nada")
							.email("nada@gmail.com")
					.build());
		};
	}
}
