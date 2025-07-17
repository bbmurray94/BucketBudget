package com.bucket_budget.core.repository;

import com.bucket_budget.core.entity.SubBucket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubBucketRepository extends CrudRepository<SubBucket, Integer> {
    @Query("SELECT s FROM SubBucket s WHERE s.bucketId = :bucketId")
    List<SubBucket> findAllByBucketId(@Param("bucketId") Integer bucketId);

    @Query("SELECT s FROM SubBucket s WHERE s.bucketId= :bucketId AND s.id = :id")
    SubBucket findByBucketId(@Param("bucketId") Integer bucketId, @Param("id") Integer id);
}
