package com.example.stereotypeannotations;

import com.example.stereotypeannotations.entity.Employee;
import com.example.stereotypeannotations.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class StereotypeAnnotationsApplication implements CommandLineRunner {

    @Autowired
    EmpRepository empRepository;

    public static void main(String[] args) {
        SpringApplication.run(StereotypeAnnotationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee(1,"Jemima Begum","1.01.2019", "In-House","Operations", "France");
        Employee e2 = new Employee(2, "Mercedes Banks", "1.02.2019", "Reference", "Accounting", "Italy");

        empRepository.employee.addAll(Arrays.asList(e1, e2));
    }
}
