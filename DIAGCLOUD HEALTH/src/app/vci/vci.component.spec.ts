import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VciComponent } from './vci.component';

describe('VciComponent', () => {
  let component: VciComponent;
  let fixture: ComponentFixture<VciComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VciComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VciComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
