package com.bucket_budget.core;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private Integer subBucketId;
    private double amount;
    private String description;

    public Transaction(Integer id, Date date, Integer subBucketId, double amount, String description){
        this.id = id;
        this.date = date;
        this.subBucketId = subBucketId;
        this.amount = amount;
        this.description = description;
    }

    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public Date getDate() { return this.date; }
    public void setDate(Date date) { this.date = date; }

    public Integer getSubBucketId() { return this.subBucketId; }
    public void setSubBucketId(Integer subBucketId) { this.subBucketId = subBucketId; }

    public double getAmount() { return this.amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }
}
