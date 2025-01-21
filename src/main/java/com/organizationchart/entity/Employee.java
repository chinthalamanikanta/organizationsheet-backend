package com.organizationchart.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;

    private Long empId;

    @Column(nullable = false, unique = true)
    private String email; 

    @Column(nullable = false)
    private String firstName;


    @Column(nullable = false)
    private String lastName;

    @Column(name = "reportingTo")
    private Long reportingTo; // Employee ID of the reporting manager

    @Column(nullable = false)
    private String country; 

    // Getters and Setters

    
}
