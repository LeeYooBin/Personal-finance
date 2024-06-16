package com.finance.entrypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.entrypoint.dto.ExpenseDTO;
import com.finance.infra.service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
  @Autowired
  private ExpenseService expenseService;

  @PostMapping
  public ResponseEntity<ExpenseDTO> createExpense(@RequestBody ExpenseDTO expenseDTO) {
    return ResponseEntity.ok(expenseService.createExpense(expenseDTO));
  }

  @GetMapping
  public ResponseEntity<List<ExpenseDTO>> getAllExpenses() {
    return ResponseEntity.ok(expenseService.getAllExpenses());
  }
}
