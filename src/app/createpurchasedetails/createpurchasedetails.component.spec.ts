import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatepurchasedetailsComponent } from './createpurchasedetails.component';

describe('CreatepurchasedetailsComponent', () => {
  let component: CreatepurchasedetailsComponent;
  let fixture: ComponentFixture<CreatepurchasedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreatepurchasedetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CreatepurchasedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
