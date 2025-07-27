import { Component } from '@angular/core';
import { Bucket } from '../bucket';

@Component({
  selector: 'app-bucket-summary',
  imports: [],
  templateUrl: './bucket-summary.html',
  styleUrl: './bucket-summary.css'
})
export class BucketSummary {
  // buckets: Bucket[] = [];
  buckets: Bucket[] = [
    {
      id: 1,
      name: 'Bills',
      subBuckets: [
        { id: 101, name: 'Rent', amount: 30 },
        { id: 102, name: 'Utilities', amount: 20 }
      ]
    },
    {
      id: 2,
      name: 'Loans',
      subBuckets: [
        { id: 201, name: 'Student', amount: 50 },
        { id: 202, name: 'WellsFargo', amount: 25 }
      ]
    }
  ];

}
