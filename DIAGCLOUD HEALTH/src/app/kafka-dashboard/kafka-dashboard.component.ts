import {Component, HostListener, OnInit} from '@angular/core';

@Component({
  selector: 'app-kafka-dashboard',
  templateUrl: './kafka-dashboard.component.html',
  styleUrls: ['./kafka-dashboard.component.css']
})
export class KafkaDashboardComponent {

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
