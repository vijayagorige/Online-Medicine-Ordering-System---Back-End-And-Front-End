import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewpurchasedetailsComponent } from './viewpurchasedetails.component';

describe('ViewpurchasedetailsComponent', () => {
  let component: ViewpurchasedetailsComponent;
  let fixture: ComponentFixture<ViewpurchasedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewpurchasedetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ViewpurchasedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
