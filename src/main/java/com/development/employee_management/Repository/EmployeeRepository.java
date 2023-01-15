package com.development.employee_management.Repository;

import com.development.employee_management.Models.EmployeeModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // JPA Repository
// Entity,Datatype of Primary Key
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

}
