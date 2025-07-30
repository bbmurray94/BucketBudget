package com.bucket_budget.core.entity;

public class SubBucketSummary implements ISubBucket{
    private Integer id;
    private Integer bucketId;
    private String name;
    private double amountAvailable;

    public SubBucketSummary(){}

    public SubBucketSummary(Integer id, Integer bucketId, String name){
        this.id = id;
        this.bucketId = bucketId;
        this.name = name;
    }

    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public Integer getBucketId() { return this.bucketId; }
    public void setBucketId(Integer bucketId) { this.bucketId = bucketId; }

    public double getAmountAvailable() { return this.amountAvailable; }
    public void setAmountAvailable(double amountAvailable) { this.amountAvailable = amountAvailable; }
}
