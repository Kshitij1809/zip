package com.expensemgr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensemgr.dto.ExpenseDTO;
import com.expensemgr.entity.Expense;
import com.expensemgr.exceptions.NoSuchExpenseFoundException;
import com.expensemgr.services.ExpenseServices;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
	
	@Autowired
	ExpenseServices expenseService;
	
	@GetMapping("/{id}")
	public ExpenseDTO getExpense(@PathVariable int id) {
		try {
			return expenseService.getExpenseService(id);			
		}catch(NoSuchExpenseFoundException e) {
			e.getMessage();
		}
		return null;
	}
	
	@GetMapping("/all")
	public List<ExpenseDTO> getAllExpense(){
		return expenseService.getAllExpensesService();
	}
	
	@PostMapping("/add")
	public ExpenseDTO createNewUsers(@RequestBody Expense expense){
		return expenseService.createExpenseService(expense);
	}
	
	@PatchMapping("/update")
	public boolean updateExpense(@RequestBody Expense expense){
		try {
			return expenseService.updateExpenseService(expense);
		}catch(NoSuchExpenseFoundException e) {
			e.getMessage();
		}
		return false;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteExpense(@PathVariable int id){
		try {
			return expenseService.deleteExpenseService(id);
		}catch(NoSuchExpenseFoundException e) {
			e.getMessage();
		}
		return false;
	}
	
}
