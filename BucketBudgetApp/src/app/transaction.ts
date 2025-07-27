export interface Transaction {
    id: number;
    date: Date;
    subBucketId: number;
    amount: number;
    description: string;
}