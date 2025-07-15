package com.bucket_budget.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BucketSummary {
    @Id
    private Integer id;
    private Integer bucketId;
    private String name;
    private double amountAvailable;

    public BucketSummary(){}

    public BucketSummary(Integer id, Integer bucketId, String name, double amountAvailable){
        this.id = id;
        this.bucketId = bucketId;
        this.name = name;
        this.amountAvailable = amountAvailable;
    }

    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getBucketId() { return this.bucketId; }
    public void setBucketId(Integer bucketId) { this.bucketId = bucketId; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public double getAmountAvailable() { return this.amountAvailable; }
    public void setAmountAvailable(double amountAvailable) { this.amountAvailable = amountAvailable; }
}
