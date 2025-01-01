package com.expensemgr.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="expenses")
public class Expense {

	@Id
	@Column(name="expenseid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int expenseid;	
	
	@Column(name="userid")
	int userid;
	
	@Column(name="categoryid")
	int categoryid;
	
	@Column(name="expensename")
	String expensename;

	@Column(name="expensedescription")
	String expensedescription;
	
	@Column(name="expenseamount")
	String expenseamount;
	
	@Column(name="expensemode")
	String expensemode;
	
	@Column(name="expensedate")
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
