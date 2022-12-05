package com.example.stereotypeannotations.controller;

import com.example.stereotypeannotations.entity.Employee;
import com.example.stereotypeannotations.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/get/all")
    public List<Employee> getAll(){
        return empService.getAll();
    }

    @GetMapping("/get/byHiringDate")
    public List<Employee> getByHiringDate(@RequestParam String hiringDate){
        return empService.getByHiringDate(hiringDate);
    }

    @GetMapping("/get/byHiringSource")
    public List<Employee> getByHiringSource(@RequestParam String hiringSource){
        return empService.getByHiringSource(hiringSource);
    }

    @PostMapping("/add")
    public String getAll(@RequestBody Employee emp){
        return empService.add(emp);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Employee emp){
        return empService.edit(emp);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int id){
        return empService.delete(id);
    }
}
