import {Component, HostListener, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-product-instance',
  templateUrl: './product-instance.component.html',
  styleUrls: ['./product-instance.component.css']
})
export class ProductInstanceComponent implements OnInit {
  constructor(private http: HttpClient) {}

  ngOnInit(): void {

  }

}
