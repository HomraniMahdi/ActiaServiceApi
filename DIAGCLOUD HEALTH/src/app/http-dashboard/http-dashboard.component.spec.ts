import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpDashboardComponent } from './http-dashboard.component';

describe('HttpDashboardComponent', () => {
  let component: HttpDashboardComponent;
  let fixture: ComponentFixture<HttpDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HttpDashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HttpDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
