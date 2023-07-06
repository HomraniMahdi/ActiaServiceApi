import {Component, HostListener, OnInit} from '@angular/core';

@Component({
  selector: 'app-docker-dashboard',
  templateUrl: './docker-dashboard.component.html',
  styleUrls: ['./docker-dashboard.component.css']
})
export class DockerDashboardComponent {
  headerStyle = {};
  showNavBar = false;
  timerId:any;
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
      clearTimeout(this.timerId);

    } else {
      this.timerId = setTimeout(() => {
        this.headerStyle = {};
        this.showNavBar = false;
      }, 10000);
    }
  }
}
