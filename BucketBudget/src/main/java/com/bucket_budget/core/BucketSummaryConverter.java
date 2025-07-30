package com.bucket_budget.core;

import com.bucket_budget.core.entity.Bucket;
import com.bucket_budget.core.entity.BucketSummary;
import com.bucket_budget.core.entity.SubBucket;
import com.bucket_budget.core.entity.SubBucketSummary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BucketSummaryConverter {

    public BucketSummaryConverter(){}

    public List<Bucket> convertToBucketList(List<BucketSummary> bucketSummaryList){
        List<Bucket> bucketList = new ArrayList<Bucket>();
        Bucket bucket = new Bucket();
        for (BucketSummary bucketSummary : bucketSummaryList){
            Optional<Bucket> matchingBucket = bucketList.stream().filter(b -> bucketSummary.getBucketId().equals(b.getId())).findFirst();
            if(!matchingBucket.isPresent()){
                bucket = convertToBucket(bucketSummary);
                bucketList.add(convertToBucket(bucketSummary));
            }
            else{
                bucket = matchingBucket.get();
            }
            bucket.addToSubBucketList(convertToSubBucket(bucketSummary));
        }
        return bucketList;
    }

    public Bucket convertToBucket(BucketSummary bucketSummary){
        return new Bucket(bucketSummary.getBucketId(), bucketSummary.getBucketName());
    }

    public SubBucketSummary convertToSubBucket(BucketSummary bucketSummary){
        SubBucketSummary subBucket = new SubBucketSummary(bucketSummary.getSubBucketId(), bucketSummary.getBucketId(), bucketSummary.getSubBucketName());
        subBucket.setAmountAvailable(bucketSummary.getAmountAvailable());
        return subBucket;
    }
}
