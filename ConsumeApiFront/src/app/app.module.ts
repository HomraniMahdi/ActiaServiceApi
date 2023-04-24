import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './users/users.component';
import {Routes} from "@angular/router";
import {HttpClientModule} from "@angular/common/http";
import { GrafanaComponent } from './grafana/grafana.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import {SwaggerUiComponent} from "./swagger-ui/swagger-ui.component";

const routes: Routes = [
  { path: '', component: UsersComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    GrafanaComponent,
    SwaggerUiComponent,
    HomeComponent,
    NavBarComponent,
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
