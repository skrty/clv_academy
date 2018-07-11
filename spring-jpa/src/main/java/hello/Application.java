package hello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.entity.Customer;
import hello.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			processCustomer(repository);
		};
	}
	
	private void processCustomer(CustomerRepository repository) {
		List<Customer> customers = new LinkedList<>();
		customers.add(new Customer("Karel", "Novák"));
		customers.add(new Customer("Karel", "Petřina"));
		customers.add(new Customer("Jan", "Novák"));
		customers.add(new Customer("Karel", "Řízek"));
		customers.add(new Customer("Pepa", "Novák"));
		customers.add(new Customer("Karel", "Koutný"));
		
		Iterable<Customer> savedCustomers = repository.saveAll(customers);
		for(Customer c : savedCustomers) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------------");
		
		Iterable<Customer> byFirstName = repository.findByFirstName("Karel");
		for(Customer c : byFirstName) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------------");
		
		Iterable<Customer> kn = repository.findByFirstNameOrLastName("Karel", "Novák");
		for(Customer c : kn) {
			System.out.println(c);
		}
	}
}