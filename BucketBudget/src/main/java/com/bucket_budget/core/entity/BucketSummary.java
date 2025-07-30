package com.bucket_budget.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BucketSummary {
    @Id
    private Integer subBucketId;
    private Integer bucketId;
    private String subBucketName;
    private String bucketName;
    private double amountAvailable;

    public BucketSummary(){}

    public BucketSummary(Integer subBucketId, Integer bucketId, String subBucketName, String bucketName, double amountAvailable){
        this.subBucketId = subBucketId;
        this.bucketId = bucketId;
        this.subBucketName = subBucketName;
        this.bucketName = bucketName;
        this.amountAvailable = amountAvailable;
    }

    public Integer getSubBucketId() { return this.subBucketId; }
    public void setSubBucketId(Integer subBucketId) { this.subBucketId = subBucketId; }

    public Integer getBucketId() { return this.bucketId; }
    public void setBucketId(Integer bucketId) { this.bucketId = bucketId; }

    public String getSubBucketName() { return this.subBucketName; }
    public void setSubBucketName(String subBucketName) { this.subBucketName = subBucketName; }

    public String getBucketName() { return this.bucketName; }
    public void setBucketName(String bucketName) { this.bucketName = bucketName; }

    public double getAmountAvailable() { return this.amountAvailable; }
    public void setAmountAvailable(double amountAvailable) { this.amountAvailable = amountAvailable; }
}
