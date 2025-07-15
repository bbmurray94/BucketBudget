package com.bucket_budget.core.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Buckets")
public class Bucket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Bucket(){}

    public Bucket(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

}
