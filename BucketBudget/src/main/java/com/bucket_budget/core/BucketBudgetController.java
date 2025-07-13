package com.bucket_budget.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BucketBudgetController {

    private final BucketBudgetService bucketBudgetService;

    public BucketBudgetController(BucketBudgetService service){
        this.bucketBudgetService = service;
    }

    @GetMapping("/buckets")
    public List<Bucket> Get(){
        return bucketBudgetService.getAllBuckets();
    }
}
