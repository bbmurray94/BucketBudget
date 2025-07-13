package com.bucket_budget.core;

import com.bucket_budget.core.repository.BucketRepository;
import java.util.List;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;

@Service
public class BucketBudgetService {
    private final BucketRepository repository;

    public BucketBudgetService(BucketRepository repository) {
        this.repository = repository;
    }
    public List<Bucket> getAllBuckets(){
        return ImmutableList.copyOf(repository.findAll());
    }
}
