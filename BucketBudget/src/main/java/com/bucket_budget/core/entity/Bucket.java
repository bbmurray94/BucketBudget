package com.bucket_budget.core.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Buckets")
public class Bucket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Transient
    private List<ISubBucket> subBucketList;

    public Bucket(){}

    public Bucket(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public List<ISubBucket> getSubBucketList() { return this.subBucketList; }
    public void setSubBucketList(List<ISubBucket> subBucketList){ this.subBucketList = subBucketList; }

    public void addToSubBucketList(ISubBucket subBucket){
        if(this.subBucketList == null){
            this.subBucketList = new ArrayList<ISubBucket>();
        }
        this.subBucketList.add(subBucket);
    }

}
