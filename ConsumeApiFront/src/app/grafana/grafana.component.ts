import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grafana',
  template: '<iframe src="http://localhost:3000/d/your-dashboard-id/your-dashboard-name"></iframe>',
  styleUrls: ['./grafana.component.css']
})
export class GrafanaComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
