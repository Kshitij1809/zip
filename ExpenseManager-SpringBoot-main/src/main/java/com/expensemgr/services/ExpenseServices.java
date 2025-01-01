package com.expensemgr.services;

import java.util.List;

import com.expensemgr.dto.ExpenseDTO;
import com.expensemgr.entity.Expense;

public interface ExpenseServices {
	public ExpenseDTO getExpenseService(int id);
	public List<ExpenseDTO> getAllExpensesService();
	public ExpenseDTO createExpenseService(Expense expense);
	public boolean updateExpenseService(Expense expense);
	public boolean deleteExpenseService(int id);
}
