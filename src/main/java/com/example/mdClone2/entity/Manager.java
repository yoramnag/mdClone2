package com.example.mdClone2.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Manager extends Person {

    @OneToMany(mappedBy = "manager")
    @JsonManagedReference
    private List<Employee> employeeList;
}
