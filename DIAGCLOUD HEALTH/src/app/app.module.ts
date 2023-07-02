import {APP_INITIALIZER, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './users/users.component';

import {HttpClientModule} from "@angular/common/http";
import { GrafanaComponent } from './grafana/grafana.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import {SwaggerUiComponent} from "./swagger-ui/swagger-ui.component";
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import {initializer} from "../utils/app-inits";
import { VciComponent } from './vci/vci.component';

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    GrafanaComponent,
    SwaggerUiComponent,
    HomeComponent,
    NavBarComponent,
    VciComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    KeycloakAngularModule,
    AppRoutingModule
  ],
  providers: [
    // add this provider
    {
      provide: APP_INITIALIZER,
      useFactory: initializer,
      deps: [KeycloakService],
      multi: true,
    },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
