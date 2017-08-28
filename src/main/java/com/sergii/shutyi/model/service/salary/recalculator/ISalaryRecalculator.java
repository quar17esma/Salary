package com.sergii.shutyi.model.service.salary.recalculator;

import com.sergii.shutyi.model.entity.employee.IEmployee;

import java.util.List;

public interface ISalaryRecalculator {
    void recalculateSalary(List<IEmployee> employees, Long remainder);
}
