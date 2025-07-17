package com.bucket_budget.core;

import com.bucket_budget.core.entity.Bucket;
import com.bucket_budget.core.entity.BucketSummary;
import com.bucket_budget.core.entity.SubBucket;
import com.bucket_budget.core.entity.Transaction;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/buckets")
    public Bucket addBucket(@RequestBody Bucket bucket){
        return bucketBudgetService.addBucket(bucket);
    }

    // SubBuckets
    @GetMapping("/buckets/{bucketId}/subbuckets")
    public List<SubBucket> getAllSubBuckets(@PathVariable Integer bucketId){
        return bucketBudgetService.getAllSubBucketsByBucketId(bucketId);
    }

    @GetMapping("/buckets/{bucketId}/subbuckets/{id}")
    public SubBucket getSubBucket(@PathVariable Integer bucketId, @PathVariable Integer id){
        return bucketBudgetService.getSubBucketByBucketId(bucketId, id);
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

    @PostMapping("/transactions")
    public Transaction addTransaction(@RequestBody Transaction transaction){
        return bucketBudgetService.addTransaction(transaction);
    }
}
