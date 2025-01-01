package com.expensemgr.dto;

import java.sql.Date;

public class ExpenseDTO {
	
	int expenseid;
	int userid;
	int categoryid;
	String expensename;	
	String expensedescription;
	String expenseamount;
	String expensemode;
	Date expensedate;
	
	public int getExpenseid() {
		return expenseid;
	}
	public void setExpenseid(int expenseid) {
		this.expenseid = expenseid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getExpensename() {
		return expensename;
	}
	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}
	public String getExpensedescription() {
		return expensedescription;
	}
	public void setExpensedescription(String expensedescription) {
		this.expensedescription = expensedescription;
	}
	public String getExpenseamount() {
		return expenseamount;
	}
	public void setExpenseamount(String expenseamount) {
		this.expenseamount = expenseamount;
	}
	public String getExpensemode() {
		return expensemode;
	}
	public void setExpensemode(String expensemode) {
		this.expensemode = expensemode;
	}
	public Date getExpensedate() {
		return expensedate;
	}
	public void setExpensedate(Date expensedate) {
		this.expensedate = expensedate;
	}
	
}
