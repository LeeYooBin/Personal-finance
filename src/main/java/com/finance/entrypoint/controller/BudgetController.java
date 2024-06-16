package com.finance.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.entrypoint.dto.BudgetDTO;
import com.finance.infra.service.BudgetService;

@RestController
@RequestMapping("/budget")
public class BudgetController {
  @Autowired
  private BudgetService budgetService;

  @PostMapping
  public ResponseEntity<BudgetDTO> createBudget(@RequestBody BudgetDTO budgetDTO) {
    return ResponseEntity.ok(budgetService.createBudget(budgetDTO));
  }

  @GetMapping
  public ResponseEntity<BudgetDTO> getBudget() {
    BudgetDTO budgetDTO = budgetService.getBudget();
    if (budgetDTO == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(budgetDTO);
  }
}
