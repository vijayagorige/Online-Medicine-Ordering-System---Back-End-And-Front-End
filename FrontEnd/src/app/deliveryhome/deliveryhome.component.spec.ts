import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeliveryhomeComponent } from './deliveryhome.component';

describe('DeliveryhomeComponent', () => {
  let component: DeliveryhomeComponent;
  let fixture: ComponentFixture<DeliveryhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DeliveryhomeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DeliveryhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
