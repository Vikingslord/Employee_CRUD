package com.development.employee_management.Service.Implementation;

import com.development.employee_management.Models.EmployeeModel;
import com.development.employee_management.Repository.EmployeeRepository;
import com.development.employee_management.Service.EmployeeService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeModel> findAllEmployee() {
        return employeeRepository.findAll(); //finding all employees
    }

    @Override
    public Optional<EmployeeModel> finById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeModel saveEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public EmployeeModel updateEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
