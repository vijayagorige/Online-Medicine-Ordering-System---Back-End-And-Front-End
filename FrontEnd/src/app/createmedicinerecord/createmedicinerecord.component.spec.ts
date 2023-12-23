import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatemedicinerecordComponent } from './createmedicinerecord.component';

describe('CreatemedicinerecordComponent', () => {
  let component: CreatemedicinerecordComponent;
  let fixture: ComponentFixture<CreatemedicinerecordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreatemedicinerecordComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CreatemedicinerecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
