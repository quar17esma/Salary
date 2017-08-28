package com.sergii.shutyi.model.service.employee.sorter;

import com.sergii.shutyi.model.entity.employee.IEmployee;
import com.sergii.shutyi.model.service.employee.sorter.comparator.EmployeeComparator;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EmployeeSorter {

    public List<IEmployee> sortByFio(List<IEmployee> employeeList){
        Objects.requireNonNull(employeeList);
        if (employeeList.isEmpty()) {
            throw new IllegalArgumentException("employeeList is empty");
        }

        Collections.sort(employeeList, EmployeeComparator.SORT_BY_FIO);
        return employeeList;
    }

    public List<IEmployee> sortByHiredDate(List<IEmployee> employeeList){
        Objects.requireNonNull(employeeList);
        if (employeeList.isEmpty()) {
            throw new IllegalArgumentException("employeeList is empty");
        }

        Collections.sort(employeeList, EmployeeComparator.SORT_BY_HIRED_DATE);
        return employeeList;
    }

}
