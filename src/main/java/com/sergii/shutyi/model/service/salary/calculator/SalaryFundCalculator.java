package com.sergii.shutyi.model.service.salary.calculator;

import com.sergii.shutyi.model.entity.employee.IEmployee;
import com.sergii.shutyi.model.entity.employee.Manager;
import com.sergii.shutyi.model.service.salary.fund.SalaryFund;
import com.sergii.shutyi.model.service.salary.recalculator.ISalaryRecalculator;

import java.time.LocalDate;
import java.util.List;

public class SalaryFundCalculator implements ISalaryFundCalculator {

    private ISalaryRecalculator recalculator;

    public SalaryFundCalculator(ISalaryRecalculator recalculator) {
        this.recalculator = recalculator;
    }

    public void recalculateSalaryWithRemainder(List<IEmployee> employees) {
        Long remainder = countSalaryFundRemainder(employees);

        recalculator.recalculateSalary(employees, remainder);
    }

    public Long countSalaryFundRemainder(List<IEmployee> employees) {
        Long remainder = SalaryFund.SALARY_FUND - countSalary(employees);

        return remainder;
    }

    public Long countSalary(List<IEmployee> employees) {

        Long salarySum = 0L;

        for (IEmployee employee : employees) {
            salarySum += calculateEmployeeSalary(employee);
        }

        return salarySum;
    }

    public Long calculateEmployeeSalary(IEmployee employee) {
        Long salarySum = 0L;

        // salary
        salarySum += employee.getSalaryBase();

        // birthday bonus
        if (employee.getBirthday().getMonth().equals(LocalDate.now().getMonth())) {
            salarySum += SalaryFund.BIRTHDAY_BONUS;
        }

        // manager bonus
        if (employee instanceof Manager) {
            Manager manager = (Manager)employee;
            salarySum += countManagerBonus(manager);
        }

        return salarySum;
    }

    public Long countManagerBonus(Manager manager) {

        List<IEmployee> employeeList = manager.getEmployeeList();
        Long bonusSum = 0L;
        for (IEmployee employee : employeeList) {
            bonusSum += SalaryFund.BONUS_PER_EMPLOYEE;
        }

        return bonusSum;
    }

    public void setRecalculator(ISalaryRecalculator recalculator) {
        this.recalculator = recalculator;
    }
}
