package com.bucket_budget.core.repository;

import com.bucket_budget.core.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}
