import { Component, inject } from '@angular/core';
import { BucketService } from '../bucket-service';
import { Bucket } from '../bucket';

@Component({
  selector: 'app-bucket-summary',
  imports: [],
  templateUrl: './bucket-summary.html',
  styleUrl: './bucket-summary.css'
})
export class BucketSummary {

  buckets: Bucket[] = [];
  
  constructor(private bucketService: BucketService){}

  ngOnInit() {
    this.bucketService.getBucketSummary().subscribe(b => this.buckets = b);
  }
}
