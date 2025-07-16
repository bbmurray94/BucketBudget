package com.bucket_budget.core;

import com.bucket_budget.core.entity.Bucket;
import com.bucket_budget.core.entity.BucketSummary;
import com.bucket_budget.core.entity.SubBucket;
import com.bucket_budget.core.entity.Transaction;
import com.bucket_budget.core.repository.BucketRepository;

import java.util.List;
import java.util.Optional;

import com.bucket_budget.core.repository.BucketSummaryRepository;
import com.bucket_budget.core.repository.SubBucketRepository;
import com.bucket_budget.core.repository.TransactionRepository;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;

@Service
public class BucketBudgetService {
    private final BucketRepository bucketRepository;
    private final SubBucketRepository subBucketRepository;
    private final TransactionRepository transactionRepository;
    private final BucketSummaryRepository bucketSummaryRepository;

    public BucketBudgetService(BucketRepository bucketRepository,
                               SubBucketRepository subBucketRepository,
                               TransactionRepository transactionRepository,
                               BucketSummaryRepository bucketSummaryRepository) {
        this.bucketRepository = bucketRepository;
        this.subBucketRepository = subBucketRepository;
        this.transactionRepository = transactionRepository;
        this.bucketSummaryRepository = bucketSummaryRepository;

    }

    // Buckets
    public List<Bucket> getAllBuckets(){
        return ImmutableList.copyOf(bucketRepository.findAll());
    }
    public Bucket getBucket(Integer id){
        Optional<Bucket> result = bucketRepository.findById(id);
        return result.orElse(null);
    }

    public Bucket addBucket(Bucket newBucket){
        return bucketRepository.save(newBucket);
    }

    // SubBuckets
    public List<SubBucket> getAllSubBuckets(){
        return ImmutableList.copyOf((subBucketRepository.findAll()));
    }

    public SubBucket getSubBucket(Integer id){
        Optional<SubBucket> result = subBucketRepository.findById(id);
        return result.orElse(null);
    }

    // Bucket Summary
    public List<BucketSummary> getBucketSummary(){
        return ImmutableList.copyOf(bucketSummaryRepository.findAll());
    }

    // Transactions
    public List<Transaction> getAllTransactions(){
        return ImmutableList.copyOf(transactionRepository.findAll());
    }

    public Transaction getTransaction(Integer id){
        Optional<Transaction> result = transactionRepository.findById(id);
        return result.orElse(null);
    }

    public Transaction addTransaction(Transaction newTransaction){
        return transactionRepository.save(newTransaction);
    }
}
