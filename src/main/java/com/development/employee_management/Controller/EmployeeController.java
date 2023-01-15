package com.development.employee_management.Controller;

import com.development.employee_management.Models.EmployeeModel;
import com.development.employee_management.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<EmployeeModel> getAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeModel> findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.finById(id);
    }

    @PostMapping
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeService.saveEmployee(employeeModel);
    }

    @PutMapping
    public EmployeeModel updateEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeService.updateEmployee(employeeModel);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }

}
