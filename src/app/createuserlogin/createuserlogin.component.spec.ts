import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateuserloginComponent } from './createuserlogin.component';

describe('CreateuserloginComponent', () => {
  let component: CreateuserloginComponent;
  let fixture: ComponentFixture<CreateuserloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreateuserloginComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CreateuserloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
