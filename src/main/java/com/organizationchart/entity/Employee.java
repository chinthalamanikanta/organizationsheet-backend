package com.organizationchart.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
    private Long empId;

    @Column(nullable = false, unique = true)
    private String email; 

    @Column(nullable = false)
    private String name; 

    @Column(name = "reporting_to")
    private Long reportingTo; // Employee ID of the reporting manager

    @Column(nullable = false)
    private String country; 

    // Getters and Setters
}
