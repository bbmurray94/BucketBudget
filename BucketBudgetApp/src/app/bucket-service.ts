import { inject, Injectable } from '@angular/core';
import { Bucket } from './bucket';
import { HttpClient } from '@angular/common/http';
import { Observable, subscribeOn } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BucketService {
  private url = "http://localhost:8080/bucket-summary"
  private http = inject(HttpClient);

    getBucketSummary(): Observable<Bucket[]> {
      return this.http.get<Bucket[]>(this.url);
    }
}
