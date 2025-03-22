package com.example.mdClone2.dto;

import com.example.mdClone.utils.Person;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class ManagerDto extends Person {

    @NotEmpty(message = "employee list can NOT be null or empty")
    private List<EmployeeDto> employeeList;
}
