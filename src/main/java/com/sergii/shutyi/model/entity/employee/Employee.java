package com.sergii.shutyi.model.entity.employee;

import com.sergii.shutyi.model.entity.company.Company;
import com.sergii.shutyi.model.enums.Department;

import java.time.LocalDate;

public class Employee implements IEmployee {

    private Long salaryBase;

    private Long salary;

    private String fio;

    private LocalDate birthday;

    private LocalDate hiredDate;

    private Manager manager;

    private Company company;

    private Department department;

    public Employee() {
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    @Override
    public Long getSalaryBase() {
        return salaryBase;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public Company getCompany() {
        return company;
    }

    @Override
    public Department getDepartment() {
        return department;
    }

    @Override
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
