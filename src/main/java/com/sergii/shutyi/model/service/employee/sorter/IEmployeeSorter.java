package com.sergii.shutyi.model.service.employee.sorter;

import com.sergii.shutyi.model.entity.employee.IEmployee;

import java.util.List;

public interface IEmployeeSorter {

    List<IEmployee> sortByFio(List<IEmployee> employeeList);

    List<IEmployee> sortByHiredDate(List<IEmployee> employeeList);
}
