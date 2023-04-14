import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './users/users.component';
import {Routes} from "@angular/router";
import {HttpClientModule} from "@angular/common/http";
import { GrafanaComponent } from './grafana/grafana.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: '', component: UsersComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    GrafanaComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
