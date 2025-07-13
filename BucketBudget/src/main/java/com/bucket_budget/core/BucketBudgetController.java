package com.bucket_budget.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BucketBudgetController {

    @GetMapping("/buckets")
    public List<Bucket> Get(){
        List<Bucket> list = new ArrayList<>();
        list.add(new Bucket(1, "Rent", 10.00));
        list.add(new Bucket(2, "Health Insurance", 40.00));

        return list;
    }
}
