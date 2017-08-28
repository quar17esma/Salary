package com.sergii.shutyi.model.service.salary.recalculator;

import com.sergii.shutyi.model.entity.employee.IEmployee;

import java.util.List;

public class EvenlySalaryRecalculator implements ISalaryRecalculator {
    @Override
    public void recalculateSalary(List<IEmployee> employees, Long remainder) {
        int employeeQuantity = employees.size();
        Long addition = remainder / employeeQuantity;

        for (IEmployee employee : employees) {
            Long oldSalary = employee.getSalary();
            employee.setSalary(oldSalary + addition);
        }
    }
}
