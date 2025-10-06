package com.sk.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Expense;

public interface ExpensesRepository  extends JpaRepository<Expense, Long>{

    List<Expense> findByCategory(String category);
    List<Expense> findByDateBetween(LocalDate start, LocalDate end);	
	
	
}
