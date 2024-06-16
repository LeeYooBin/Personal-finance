package com.finance.entrypoint.dto;

public class BudgetDTO {
  Long id; 
  String name; 
  Double limitAmount;
  
  public BudgetDTO() {
  }

  public BudgetDTO(Long id, String name, Double limitAmount) {
    this.id = id;
    this.name = name;
    this.limitAmount = limitAmount;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getLimitAmount() {
    return limitAmount;
  }

  public void setLimitAmount(Double limitAmount) {
    this.limitAmount = limitAmount;
  }
}
