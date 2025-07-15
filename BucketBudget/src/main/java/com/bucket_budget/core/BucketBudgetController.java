package com.bucket_budget.core;

import com.bucket_budget.core.entity.Bucket;
import com.bucket_budget.core.entity.BucketSummary;
import com.bucket_budget.core.entity.SubBucket;
import com.bucket_budget.core.entity.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BucketBudgetController {

    private final BucketBudgetService bucketBudgetService;

    public BucketBudgetController(BucketBudgetService service){
        this.bucketBudgetService = service;
    }

    // Buckets
    @GetMapping("/buckets")
    public List<Bucket> getAllBuckets(){
        return bucketBudgetService.getAllBuckets();
    }

    @GetMapping("/buckets/{id}")
    public Bucket getBucket(@PathVariable Integer id){
        return bucketBudgetService.getBucket(id);
    }

    // SubBuckets
    @GetMapping("/subbuckets")
    public List<SubBucket> getAllSubBuckets(){
        return bucketBudgetService.getAllSubBuckets();
    }

    @GetMapping("/subbuckets/{id}")
    public SubBucket getSubBucket(@PathVariable Integer id){
        return bucketBudgetService.getSubBucket(id);
    }

    // Bucket Summary
    @GetMapping("/bucket-summary")
    public List<BucketSummary> getBucketSummary(){
        return bucketBudgetService.getBucketSummary();
    }

    // Transactions
    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions(){
        return bucketBudgetService.getAllTransactions();
    }

    @GetMapping("/transactions/{id}")
    public Transaction getTransaction(@PathVariable Integer id){
        return bucketBudgetService.getTransaction(id);
    }
}
