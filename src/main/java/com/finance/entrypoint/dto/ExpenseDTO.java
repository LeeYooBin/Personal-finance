package com.finance.entrypoint.dto;

import java.time.LocalDate;

public class ExpenseDTO {
  Long id;
  String description; 
  Double amount; 
  LocalDate date;
  
  public ExpenseDTO() {
  }

  public ExpenseDTO(Long id, String description, Double amount, LocalDate date) {
    this.id = id;
    this.description = description;
    this.amount = amount;
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }  
}
