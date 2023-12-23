import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatedeliveryboyComponent } from './createdeliveryboy.component';

describe('CreatedeliveryboyComponent', () => {
  let component: CreatedeliveryboyComponent;
  let fixture: ComponentFixture<CreatedeliveryboyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CreatedeliveryboyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CreatedeliveryboyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
