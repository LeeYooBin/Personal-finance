package com.finance.infra.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.domain.model.Expense;
import com.finance.entrypoint.dto.ExpenseDTO;
import com.finance.infra.repository.ExpenseRepository;

@Service
public class ExpenseService {
  @Autowired
  private ExpenseRepository expenseRepository;

  public ExpenseDTO createExpense(ExpenseDTO expenseDTO) {
    Expense expense = new Expense();
    expense.setDescription(expenseDTO.getDescription());
    expense.setAmount(expenseDTO.getAmount());
    expense.setDate(expenseDTO.getDate());
    expense = expenseRepository.save(expense);
    expenseDTO.setId(expense.getId());
    return expenseDTO;
  }

  public List<ExpenseDTO> getAllExpenses() {
    return expenseRepository.findAll().stream()
      .map(expense -> {
        ExpenseDTO dto = new ExpenseDTO();
        dto.setId(expense.getId());
        dto.setDescription(expense.getDescription());
        dto.setAmount(expense.getAmount());
        dto.setDate(expense.getDate());
        return dto;
      })
      .collect(Collectors.toList());
  }
}
