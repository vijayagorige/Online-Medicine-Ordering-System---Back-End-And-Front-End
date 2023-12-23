import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewdeliveryComponent } from './viewdelivery.component';

describe('ViewdeliveryComponent', () => {
  let component: ViewdeliveryComponent;
  let fixture: ComponentFixture<ViewdeliveryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewdeliveryComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ViewdeliveryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
