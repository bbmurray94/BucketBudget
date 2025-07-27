export interface Bucket {
    id: number;
    name: string;
    subBuckets: SubBucket[];
}

export interface SubBucket {
    id: number;
    name: string;
    amount: number;
}