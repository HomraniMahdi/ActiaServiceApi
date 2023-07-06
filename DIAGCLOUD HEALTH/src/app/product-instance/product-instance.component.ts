import {Component, HostListener, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-product-instance',
  templateUrl: './product-instance.component.html',
  styleUrls: ['./product-instance.component.css']
})
export class ProductInstanceComponent {
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
