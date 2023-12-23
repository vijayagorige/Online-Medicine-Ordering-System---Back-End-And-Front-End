import { TestBed } from '@angular/core/testing';

import { MedicinerecordsService } from './medicinerecords.service';

describe('MedicinerecordsService', () => {
  let service: MedicinerecordsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MedicinerecordsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
