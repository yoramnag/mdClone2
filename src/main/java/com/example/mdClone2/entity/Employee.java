package com.example.mdClone2.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Employee extends Person {

    private String role;

    @OneToMany(mappedBy = "employee")
    @JsonManagedReference
    private List<Timesheet> timesheetList;

    @ManyToOne(cascade= {CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "manager_id")
    @JsonBackReference
    private Manager manager;


}
