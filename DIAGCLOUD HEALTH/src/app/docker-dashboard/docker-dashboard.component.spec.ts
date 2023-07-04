import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DockerDashboardComponent } from './docker-dashboard.component';

describe('DockerDashboardComponent', () => {
  let component: DockerDashboardComponent;
  let fixture: ComponentFixture<DockerDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DockerDashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DockerDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
