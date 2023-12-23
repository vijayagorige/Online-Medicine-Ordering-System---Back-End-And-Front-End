import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PurchasedetailslistComponent } from './purchasedetailslist.component';

describe('PurchasedetailslistComponent', () => {
  let component: PurchasedetailslistComponent;
  let fixture: ComponentFixture<PurchasedetailslistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PurchasedetailslistComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PurchasedetailslistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
