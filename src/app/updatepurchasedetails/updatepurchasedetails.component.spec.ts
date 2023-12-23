import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatepurchasedetailsComponent } from './updatepurchasedetails.component';

describe('UpdatepurchasedetailsComponent', () => {
  let component: UpdatepurchasedetailsComponent;
  let fixture: ComponentFixture<UpdatepurchasedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdatepurchasedetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdatepurchasedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
