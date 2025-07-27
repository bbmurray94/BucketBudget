import { Component } from '@angular/core';
import { Transaction } from '../transaction';

@Component({
  selector: 'app-transactions',
  imports: [],
  templateUrl: './transactions.html',
  styleUrl: './transactions.css'
})
export class Transactions {
  //transaction: Transaction[] = [];
  transactions: Transaction[] = [
    {
      id: 1,
      date: new Date(2025, 7, 24),
      subBucketId: 1,
      amount: 200,
      description: "PayDay"
    },
    {
      id: 2,
      date: new Date(2025,7,24),
      subBucketId: 2,
      amount: -200,
      description: "Description"
    }
  ];
}
