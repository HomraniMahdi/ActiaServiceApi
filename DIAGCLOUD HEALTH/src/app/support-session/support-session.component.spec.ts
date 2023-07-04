import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SupportSessionComponent } from './support-session.component';

describe('SupportSessionComponent', () => {
  let component: SupportSessionComponent;
  let fixture: ComponentFixture<SupportSessionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SupportSessionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SupportSessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
