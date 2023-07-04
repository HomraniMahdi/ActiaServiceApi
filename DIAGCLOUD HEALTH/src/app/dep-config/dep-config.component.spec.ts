import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DepConfigComponent } from './dep-config.component';

describe('DepConfigComponent', () => {
  let component: DepConfigComponent;
  let fixture: ComponentFixture<DepConfigComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DepConfigComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DepConfigComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
