import {Component, HostListener, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";


@Component({
  selector: 'app-swagger-ui',
  templateUrl: './swagger-ui.component.html',
  styleUrls: ['./swagger-ui.component.css']
})
export class SwaggerUiComponent{
  constructor(private http: HttpClient) {}
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
  ngOnInit(): void {

  }
}
