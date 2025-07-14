package com.bucket_budget.core;

import jakarta.persistence.*;

@Entity
@Table(name = "SubBuckets")
public class SubBucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer bucketId;
    private String name;

    public SubBucket(Integer id, Integer bucketId, String name){
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
}
