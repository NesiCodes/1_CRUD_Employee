package com.example.stereotypeannotations.entity;

public class Employee {
    private int employeeId;
    private String name;
    private String hiringDate;
    private String hiringSource;
    private String department;
    private String country;


    public Employee(){

    }

    public Employee(int employeeId, String name, String hiringDate, String hiringSource, String department, String country) {
        this.employeeId = employeeId;
        this.name = name;
        this.hiringDate = hiringDate;
        this.hiringSource = hiringSource;
        this.department = department;
        this.country = country;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getHiringSource() {
        return hiringSource;
    }

    public void setHiringSource(String hiringSource) {
        this.hiringSource = hiringSource;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
