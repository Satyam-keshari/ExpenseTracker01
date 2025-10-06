package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.entity.Expense;
import com.sk.service.ExpenseServiceImpl;

@RestController
@RequestMapping("/expenses")
public class ExpenseController 
{
	@Autowired
	private ExpenseServiceImpl service;
	
	  @PostMapping
	    public Expense addExpense(@RequestBody Expense expense) {
	        return service.addExpense(expense);
	    }

	    @GetMapping
	    public List<Expense> getAllExpenses() {
	        return service.getAllExpenses();
	    }

	    @PutMapping("/{id}")
	    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expense) {
	        return service.updateExpense(id, expense);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteExpense(@PathVariable Long id) {
	        service.deleteExpense(id);
	        return "Deleted successfully!";
	    }
	 
}
