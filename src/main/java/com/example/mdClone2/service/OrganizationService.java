package com.example.mdClone2.service;

import com.example.mdClone2.entity.Employee;
import com.example.mdClone2.entity.Manager;
import com.example.mdClone2.exception.EmployeeNotFoundException;
import com.example.mdClone2.exception.ManagerNotFoundException;
import com.example.mdClone2.repository.EmployeeRepository;
import com.example.mdClone2.repository.ManagerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrganizationService {

    private final EmployeeRepository employeeRepository;
    private final ManagerRepository managerRepository;

    public Manager retrieveManager(String firstName, String lastName){
        Optional<Manager> optionalManager = managerRepository.findByFirstNameAndLastName(firstName,lastName);
        if(!optionalManager.isPresent()){
            throw new ManagerNotFoundException("manager","manger name",firstName+" "+lastName);
        }
        Manager manager = new Manager();
//        ManagerMapper.mapToManager(optionalManager,manager);
        return manager;
    }

    public Employee retrieveEmployee(String firstName, String lastName){
        Optional<Employee> optionalEmployee = employeeRepository.findByFirstNameAndLastName(firstName,lastName);
        if (!optionalEmployee.isPresent()){
            throw new EmployeeNotFoundException("employee","employee name",firstName+" "+lastName);
        }
        Employee employee = new Employee();
//        EmployeeMapper.mapToEmployee(optionalEmployee,employee);
        return employee;
    }
}
