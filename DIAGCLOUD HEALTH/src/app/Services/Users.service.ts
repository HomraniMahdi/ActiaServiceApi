import { Injectable } from '@angular/core';
import {User} from "../Model/User";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http :HttpClient) { }

  getAllUsers():Observable<User[]>{
    return this.http.get<User[]>("http://localhost:8081/User/users")
  }

}
