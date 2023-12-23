import { TestBed } from '@angular/core/testing';

import { UserpurchasedetailsService } from './userpurchasedetails.service';

describe('UserpurchasedetailsService', () => {
  let service: UserpurchasedetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserpurchasedetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
