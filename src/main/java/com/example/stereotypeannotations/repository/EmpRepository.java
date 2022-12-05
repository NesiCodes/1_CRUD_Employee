package com.example.stereotypeannotations.repository;

import com.example.stereotypeannotations.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepository {
    public List<Employee> employee = new ArrayList<Employee>();

    public List<Employee> getAll() {
        return employee;
    }

    public String add(Employee emp) {
        employee.add(emp);
        return "Successfully Added";
    }

    public String edit(Employee emp) {
        int empId = emp.getEmployeeId();
        for(int i=0; i<employee.size(); i++){
            if(empId == employee.get(i).getEmployeeId()){
                employee.set(i, emp);
            }
        }
        return "Successfully edited the info";
    }

    public String delete(int emp) {
        employee.remove(emp-1);
        return "Successfully deleted the info";
    }

    public List<Employee> getByHiringDate(String hiringDate) {
        List<Employee> employeesByHiringDate = new ArrayList<Employee>();
        for(int i=0; i< employee.size(); i++){
            if(hiringDate.equals(employee.get(i).getHiringDate())){
                employeesByHiringDate.add(employee.get(i));
            }
        }
        return employeesByHiringDate;
    }

    public List<Employee> getByHiringSource(String hiringSource) {
        List<Employee> employeesByHiringSource = new ArrayList<Employee>();
        for(int i=0; i< employee.size(); i++){
            if(hiringSource.equals(employee.get(i).getHiringSource())){
                employeesByHiringSource.add(employee.get(i));
            }
        }
        return employeesByHiringSource;
    }
}
