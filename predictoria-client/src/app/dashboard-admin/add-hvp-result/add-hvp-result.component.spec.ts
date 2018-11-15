import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddHvpResultComponent } from './add-hvp-result.component';

describe('AddHvpResultComponent', () => {
  let component: AddHvpResultComponent;
  let fixture: ComponentFixture<AddHvpResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddHvpResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddHvpResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
