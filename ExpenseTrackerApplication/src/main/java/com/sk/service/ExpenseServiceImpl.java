package com.sk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Expense;
import com.sk.repository.ExpensesRepository;
@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpensesRepository repo;
	@Override
	
	public Expense addExpense(Expense expense) {
		return repo.save(expense);
	}

	 @Override
	    public List<Expense> getAllExpenses() {
	        return repo.findAll();
	    }

	  @Override
	    public Expense updateExpense(Long id, Expense expense) {
	        Optional<Expense> existing = repo.findById(id);
	        if (existing.isPresent()) {
	            Expense e = existing.get();
	            e.setAmount(expense.getAmount());
	            e.setDate(expense.getDate());
	            e.setNote(expense.getNote());
	            e.setCategory(expense.getCategory());
	            return repo.save(e);
	        } else {
	            throw new RuntimeException("Expense not found with ID: " + id);
	        }
	    }
	  
	  @Override
	    public void deleteExpense(Long id) {
	        repo.deleteById(id);
	    }

}
