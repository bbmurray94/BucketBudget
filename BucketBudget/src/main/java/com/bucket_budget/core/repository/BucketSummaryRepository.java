package com.bucket_budget.core.repository;

import com.bucket_budget.core.entity.BucketSummary;
import org.springframework.data.repository.CrudRepository;

public interface BucketSummaryRepository extends CrudRepository<BucketSummary, Integer> {
}
