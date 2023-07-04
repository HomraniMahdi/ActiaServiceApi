import {Component, HostListener, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-support-session',
  templateUrl: './support-session.component.html',
  styleUrls: ['./support-session.component.css']
})
export class SupportSessionComponent implements OnInit {

  constructor(private http: HttpClient) {}
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
  ngOnInit(): void {

  }

}
