package com.bucket_budget.core;

public class Bucket {
    private int id;
    private String name;
    private double currentAmount;

    public Bucket(){}

    public Bucket(int id, String name, double currentAmount){
        this.id = id;
        this.name = name;
        this.currentAmount = currentAmount;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCurrentAmount() { return currentAmount; }
    public void setCurrentAmount(double currentAmount) { this.currentAmount = currentAmount; }
}
