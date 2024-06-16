package com.finance.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.domain.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
