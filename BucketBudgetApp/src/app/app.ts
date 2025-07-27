import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BucketSummary } from './bucket-summary/bucket-summary';
import { Transactions } from './transactions/transactions';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    BucketSummary,
    Transactions
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('BucketBudgetApp');
}
