package com.example.stereotypeannotations.service;

import com.example.stereotypeannotations.entity.Employee;
import com.example.stereotypeannotations.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public List<Employee> getAll() {
        return empRepository.getAll();
    }

    public String add(Employee emp) {
        return empRepository.add(emp);
    }

    public String edit(Employee emp) {
        return empRepository.edit(emp);
    }

    public String delete(int emp) {
        return empRepository.delete(emp);
    }

    public List<Employee> getByHiringDate(String hiringDate) {
        return empRepository.getByHiringDate(hiringDate);
    }

    public List<Employee> getByHiringSource(String hiringSource) {
        return empRepository.getByHiringSource(hiringSource);
    }
}
