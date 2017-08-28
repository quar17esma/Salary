package com.sergii.shutyi.model.entity.employee;

import com.sergii.shutyi.model.entity.company.Company;
import com.sergii.shutyi.model.enums.Department;

import java.time.LocalDate;

public interface IEmployee {
    String getFio();
    LocalDate getBirthday();
    LocalDate getHiredDate();
    Long getSalaryBase();
    void setSalary(Long salary);
    Long getSalary();
    Company getCompany();
    Department getDepartment();
}
