package com.finance.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Budget {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double limitAmount;
  
  public Budget() {
  }

  public Budget(Long id, String name, Double limitAmount) {
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
