package com.example.mdClone2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @NotEmpty(message = "first name can NOT be null or empty")
    private String firstName;
    @NotEmpty(message = "last name can NOT be null or empty")
    private String lastName;
}
