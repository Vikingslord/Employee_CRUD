package com.development.employee_management.Service;

import com.development.employee_management.Models.EmployeeModel;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeModel> findAllEmployee();

    Optional<EmployeeModel> finById(Long id);

    EmployeeModel saveEmployee(EmployeeModel employeeModel);

    EmployeeModel updateEmployee(EmployeeModel employeeModel);

    void deleteEmployee(Long id);
}
