import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewHvpComponent } from './new-hvp.component';

describe('NewHvpComponent', () => {
  let component: NewHvpComponent;
  let fixture: ComponentFixture<NewHvpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewHvpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewHvpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
