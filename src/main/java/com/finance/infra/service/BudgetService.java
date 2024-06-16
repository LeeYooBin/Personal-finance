package com.finance.infra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.domain.model.Budget;
import com.finance.entrypoint.dto.BudgetDTO;
import com.finance.infra.repository.BudgetRepository;

@Service
public class BudgetService {
  @Autowired
  private BudgetRepository budgetRepository;

  public BudgetDTO createBudget(BudgetDTO budgetDTO) {
    Budget budget = new Budget();
    budget.setName(budgetDTO.getName());
    budget.setLimitAmount(budgetDTO.getLimitAmount());
    budget = budgetRepository.save(budget);
    budgetDTO.setId(budget.getId());
    return budgetDTO;
  }

  public BudgetDTO getBudget() {
    Budget budget = budgetRepository.findAll().stream().findFirst().orElse(null);
    if (budget == null) {
      return null;
    }
    BudgetDTO budgetDTO = new BudgetDTO();
    budgetDTO.setId(budget.getId());
    budgetDTO.setName(budget.getName());
    budgetDTO.setLimitAmount(budget.getLimitAmount());
    return budgetDTO;
  }
}