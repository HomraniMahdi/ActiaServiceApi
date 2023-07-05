import {Component, HostListener, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-vci',
  templateUrl: './vci.component.html',
  styleUrls: ['./vci.component.css']
})
export class VciComponent implements OnInit {

  constructor(private http: HttpClient) {}
  headerStyle = {};
  showNavBar = false;

  ngOnInit(): void {

  }

}
