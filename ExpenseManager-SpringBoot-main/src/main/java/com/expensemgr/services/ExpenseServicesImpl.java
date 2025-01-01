package com.expensemgr.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemgr.dto.ExpenseDTO;
import com.expensemgr.entity.Expense;
import com.expensemgr.exceptions.NoSuchExpenseFoundException;
import com.expensemgr.repositories.ExpenseRepository;

@Service
public class ExpenseServicesImpl implements ExpenseServices {
	
	@Autowired
	ExpenseRepository expenseRepo;

	@Override
	public ExpenseDTO getExpenseService(int id) {
		Expense expense = expenseRepo.findById(id).orElseThrow(() -> new NoSuchExpenseFoundException("No expense is present by id " + id));
		ExpenseDTO dto = new ExpenseDTO();
		BeanUtils.copyProperties(expense,dto);
		return dto;
	}

	@Override
	public List<ExpenseDTO> getAllExpensesService() {
		List<Expense> expenses = expenseRepo.findAll();
		ArrayList<ExpenseDTO> dtoList = new ArrayList<>();
		
		for(Expense expense:expenses) {
			ExpenseDTO dto = new ExpenseDTO();
			BeanUtils.copyProperties(expense,dto);
			dtoList.add(dto);
		}
		
		return dtoList;
	}

	@Override
	public ExpenseDTO createExpenseService(Expense expense) {
		if( expense != null ) {
			Expense newExpense = expenseRepo.save(expense);
			ExpenseDTO dto = new ExpenseDTO();
			BeanUtils.copyProperties(newExpense, dto);
			return dto;
		}
		return null;
	}

	@Override
	public boolean updateExpenseService(Expense expense) {
		Expense existingExpense = expenseRepo.findById(expense.getExpenseid()).orElseThrow(()-> new NoSuchExpenseFoundException("No user is present by id " + expense.getExpenseid()));
		
		boolean flag = false;
		if(existingExpense.getUserid() != expense.getUserid()) {
			existingExpense.setUserid(expense.getUserid());
			flag = true;
		}
		if(existingExpense.getCategoryid() != expense.getCategoryid()) {
			existingExpense.setCategoryid(expense.getCategoryid());
			flag = true;
		}
		if(existingExpense.getExpenseamount() == null && expense.getExpenseamount() != null || existingExpense.getExpenseamount() != expense.getExpenseamount()) {
			existingExpense.setExpenseamount(expense.getExpenseamount());
			flag = true;
		}
		if (existingExpense.getExpensedate() == null && expense.getExpensedate() != null || !existingExpense.getExpensedate().equals(expense.getExpensedate())) {
			existingExpense.setExpensedate(expense.getExpensedate());
			flag = true;
		}
		if (existingExpense.getExpensename() == null && expense.getExpensename() != null || !existingExpense.getExpensename().equals(expense.getExpensename())) {
			existingExpense.setExpensename(expense.getExpensename());
			flag = true;
		}
		if (existingExpense.getExpensedescription() == null && expense.getExpensedescription() != null || !existingExpense.getExpensedescription().equals(expense.getExpensedescription())) {
			existingExpense.setExpensedescription(expense.getExpensedescription());
			flag = true;
		}
		if(!existingExpense.getExpensemode().equals(expense.getExpensemode())) {
			existingExpense.setExpensemode(expense.getExpensemode());
			flag = true;
		}
		if(flag) {
			expenseRepo.save(existingExpense);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteExpenseService(int id) {
		Expense expense = expenseRepo.findById(id).orElseThrow(() -> new NoSuchExpenseFoundException("No user is present by id " + id));
		expenseRepo.delete(expense);
		return true;
	}
	
	


}
