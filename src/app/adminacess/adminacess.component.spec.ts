import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminacessComponent } from './adminacess.component';

describe('AdminacessComponent', () => {
  let component: AdminacessComponent;
  let fixture: ComponentFixture<AdminacessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminacessComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminacessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
