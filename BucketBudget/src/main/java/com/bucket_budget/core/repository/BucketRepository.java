package com.bucket_budget.core.repository;

import com.bucket_budget.core.Bucket;
import org.springframework.stereotype.Repository;

public interface BucketRepository extends Repository {

    Bucket findById();
    void save(Bucket user);
}
