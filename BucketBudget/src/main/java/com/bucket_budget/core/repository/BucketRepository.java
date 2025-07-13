package com.bucket_budget.core.repository;

import com.bucket_budget.core.Bucket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BucketRepository extends CrudRepository<Bucket, Integer> {

}
