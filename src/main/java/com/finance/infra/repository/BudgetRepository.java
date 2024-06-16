package com.finance.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.domain.model.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
