package com.expensemgr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensemgr.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
 //custom queries can be written here...
}
