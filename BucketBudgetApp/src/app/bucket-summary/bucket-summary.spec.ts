import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BucketSummary } from './bucket-summary';

describe('BucketSummary', () => {
  let component: BucketSummary;
  let fixture: ComponentFixture<BucketSummary>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BucketSummary]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BucketSummary);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
