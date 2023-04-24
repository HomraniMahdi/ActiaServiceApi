import {Component, HostListener, OnInit} from '@angular/core';

@Component({
  selector: 'app-grafana',
  templateUrl: './grafana.component.html',
  styleUrls: ['./grafana.component.css']
})
export class GrafanaComponent{
  headerStyle = {};
  showNavBar = false;

  @HostListener('document:mousemove', ['$event'])
  onMouseMove(event: MouseEvent) {
    if (event.clientY < 50) {
      this.headerStyle = {
        position: 'fixed',
        top: '0',
        left: '0',
        right: '0',
        zIndex: '1'
      };
      this.showNavBar = true;
    } else {
      this.headerStyle = {};
      this.showNavBar = false;
    }
  }
}
