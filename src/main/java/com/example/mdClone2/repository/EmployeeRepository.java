package com.example.mdClone2.repository;

import com.example.mdClone2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Optional<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
