package com.sergii.shutyi.model.service.employee.type.changer;

import com.sergii.shutyi.model.entity.employee.Employee;
import com.sergii.shutyi.model.entity.employee.IEmployee;
import com.sergii.shutyi.model.entity.employee.Manager;
import com.sergii.shutyi.model.entity.employee.Other;
import com.sergii.shutyi.model.enums.Department;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTypeChanger implements IEmployeeTypeChanger {

    public void employeeToManager(Employee employee) {
        Manager manager = new Manager();
        manager.setEmployee(employee);
        manager.setEmployeeList(new ArrayList<>());

        Department department = employee.getDepartment();
        List<IEmployee> employeeList = department.getEmployeeList();
        employeeList.remove(employee);
        employeeList.add(manager);
    }

    public void managerToEmployee(Manager manager) {
        //remove manager and add employee in department
        Department department = manager.getDepartment();
        List<IEmployee> departmentEmployeeList = department.getEmployeeList();
        departmentEmployeeList.remove(manager);
        departmentEmployeeList.add(manager.getEmployee());

        //add employees to another manager
        Manager managerToGetEmployees = managerToGetEmployees(manager);
        List<IEmployee> managerEmployeeList = manager.getEmployeeList();
        managerToGetEmployees.getEmployeeList().addAll(managerEmployeeList);
    }

    public void managerToOther(Manager manager, String description) {
        //remove manager and add employee in department
        Department department = manager.getDepartment();
        List<IEmployee> departmentEmployeeList = department.getEmployeeList();
        departmentEmployeeList.remove(manager);
        Other other = new Other(manager.getEmployee(), description);
        departmentEmployeeList.add(other);

        //add employees to another manager
        Manager managerToGetEmployees = managerToGetEmployees(manager);
        List<IEmployee> managerEmployeeList = manager.getEmployeeList();
        managerToGetEmployees.getEmployeeList().addAll(managerEmployeeList);
    }

    private Manager managerToGetEmployees(Manager manager){
        Manager managerToGetEmployees = null;

        Department department = manager.getDepartment();
        List<IEmployee> departmentEmployeeList = department.getEmployeeList();
        for (IEmployee employee:departmentEmployeeList) {
            if (employee instanceof Manager && !employee.equals(manager)) {
                managerToGetEmployees = (Manager) employee;
            }
        }

        if (managerToGetEmployees == null) {
            throw new IllegalArgumentException("There is no manager in this department");
        }

        return managerToGetEmployees;
    }
}
