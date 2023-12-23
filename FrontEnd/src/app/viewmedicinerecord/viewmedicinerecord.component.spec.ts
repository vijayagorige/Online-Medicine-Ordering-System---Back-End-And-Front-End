import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewmedicinerecordComponent } from './viewmedicinerecord.component';

describe('ViewmedicinerecordComponent', () => {
  let component: ViewmedicinerecordComponent;
  let fixture: ComponentFixture<ViewmedicinerecordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewmedicinerecordComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ViewmedicinerecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
