package com.sergii.shutyi.model.service.salary.recalculator;

import com.sergii.shutyi.model.service.salary.fund.SalaryFund;
import com.sergii.shutyi.model.entity.employee.IEmployee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProportionallySalaryRecalculator implements ISalaryRecalculator {
    @Override
    public void recalculateSalary(List<IEmployee> employees, Long remainder) {
        Long salary = SalaryFund.SALARY_FUND - remainder;

        Map<IEmployee, Double> salaryProportionMap = new HashMap<>();

        for (IEmployee employee:employees) {
            Long employeeSalary = employee.getSalary();
            Double salaryProportion = new Double(employeeSalary) / salary;
            salaryProportionMap.put(employee, salaryProportion);
        }

        for (IEmployee employee : employees) {
            Long oldSalary = employee.getSalary();
            Double salaryProportion = salaryProportionMap.get(employee);
            Long addition = (long) (salary * salaryProportion);
            employee.setSalary(oldSalary + addition);
        }
    }
}
