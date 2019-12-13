package com.vd.springbootangular8crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vd.springbootangular8crud.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
