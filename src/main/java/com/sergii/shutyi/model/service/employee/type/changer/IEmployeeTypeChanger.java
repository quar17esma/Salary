package com.sergii.shutyi.model.service.employee.type.changer;

import com.sergii.shutyi.model.entity.employee.Employee;
import com.sergii.shutyi.model.entity.employee.Manager;

public interface IEmployeeTypeChanger {

    void employeeToManager(Employee employee);

    void managerToEmployee(Manager manager);

    void managerToOther(Manager manager, String description);

}
