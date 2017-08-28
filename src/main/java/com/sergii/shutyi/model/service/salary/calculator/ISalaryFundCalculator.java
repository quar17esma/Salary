package com.sergii.shutyi.model.service.salary.calculator;

import com.sergii.shutyi.model.entity.employee.IEmployee;
import com.sergii.shutyi.model.service.salary.recalculator.ISalaryRecalculator;

import java.util.List;

public interface ISalaryFundCalculator {

    void setRecalculator(ISalaryRecalculator recalculator);

    void recalculateSalaryWithRemainder(List<IEmployee> employees);

    Long countSalary(List<IEmployee> employees);
}
