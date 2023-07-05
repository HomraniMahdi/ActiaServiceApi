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

  ngOnInit(): void {

  }

}
