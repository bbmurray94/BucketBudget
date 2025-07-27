import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BucketSummary } from './bucket-summary/bucket-summary';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    BucketSummary,
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('BucketBudgetApp');
}
