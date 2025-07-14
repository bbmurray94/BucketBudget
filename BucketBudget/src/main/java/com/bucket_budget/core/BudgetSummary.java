package com.bucket_budget.core;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BudgetSummary {
    @Id
    private Integer id;
    private String name;
    private double amountAvailable;

    public BudgetSummary(Integer id, String name, double amountAvailable){
        this.id = id;
        this.name = name;
        this.amountAvailable = amountAvailable;
    }

    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public double getAmountAvailable() { return this.amountAvailable; }
    public void setAmountAvailable(double amountAvailable) { this.amountAvailable = amountAvailable; }
}
