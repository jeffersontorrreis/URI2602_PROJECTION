package com.devsuperior.uri2602;

import com.devsuperior.uri2602.dto.CustomerDTO;
import com.devsuperior.uri2602.projections.Customerprojection;
import com.devsuperior.uri2602.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2602Application  implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

	public static void main(String[] args) {

        SpringApplication.run(Uri2602Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        List<Customerprojection> list = repository.search1("RS");
        List<CustomerDTO> result1 = list.stream().map(x-> new CustomerDTO(x)).collect(Collectors.toList());

        for (CustomerDTO obj : result1){
            System.out.println(obj.getName());
        }
    }
}
