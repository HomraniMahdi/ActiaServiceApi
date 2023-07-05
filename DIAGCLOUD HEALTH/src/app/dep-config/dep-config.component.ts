import {Component, HostListener, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-dep-config',
  templateUrl: './dep-config.component.html',
  styleUrls: ['./dep-config.component.css']
})
export class DepConfigComponent implements OnInit {

  constructor(private http: HttpClient) {}
  headerStyle = {};
  showNavBar = false;


  ngOnInit(): void {

  }

}
