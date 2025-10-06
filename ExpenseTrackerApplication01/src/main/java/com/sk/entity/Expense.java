package com.sk.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="expenses")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	  @Column(nullable = false)
	    private Double amount;

	    @Column(nullable = false)
	    private LocalDate date;

	    private String category;

	    private String note;
	 

}
