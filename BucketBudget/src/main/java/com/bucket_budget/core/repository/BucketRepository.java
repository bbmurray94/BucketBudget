package com.bucket_budget.core.repository;

import com.bucket_budget.core.entity.Bucket;
import org.springframework.data.repository.CrudRepository;

public interface BucketRepository extends CrudRepository<Bucket, Integer> {
}
