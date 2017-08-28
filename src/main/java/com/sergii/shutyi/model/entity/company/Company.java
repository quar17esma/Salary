package com.sergii.shutyi.model.entity.company;

import com.sergii.shutyi.model.enums.Department;

import java.util.List;

public class Company {

    private List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

}
