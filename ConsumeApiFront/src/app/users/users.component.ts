import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {User} from "../Model/User";
import {UsersService} from "../Services/Users.service";

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  user : User;
  U : User[];
  constructor(private UsersService : UsersService ,private router : Router) { }

  ngOnInit(): void {
    this.UsersService.getAllUsers().subscribe(
      (data:any)=>{
        console.log(data);
        this.U=data

      });
  }


}
