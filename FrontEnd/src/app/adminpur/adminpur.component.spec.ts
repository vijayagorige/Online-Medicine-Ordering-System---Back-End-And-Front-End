import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminpurComponent } from './adminpur.component';

describe('AdminpurComponent', () => {
  let component: AdminpurComponent;
  let fixture: ComponentFixture<AdminpurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminpurComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminpurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
