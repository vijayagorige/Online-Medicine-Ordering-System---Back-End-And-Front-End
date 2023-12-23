import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatemedicinerecordComponent } from './updatemedicinerecord.component';

describe('UpdatemedicinerecordComponent', () => {
  let component: UpdatemedicinerecordComponent;
  let fixture: ComponentFixture<UpdatemedicinerecordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdatemedicinerecordComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdatemedicinerecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
