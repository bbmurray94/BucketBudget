export interface Bucket {
    id: number;
    name: string;
    subBucketList: SubBucket[];
}

export interface SubBucket {
    id: number;
    name: string;
    amountAvailable: number;
}