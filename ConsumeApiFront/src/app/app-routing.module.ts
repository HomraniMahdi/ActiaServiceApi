import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GrafanaComponent } from './grafana/grafana.component';
import { HomeComponent } from './home/home.component';
import { SwaggerUiComponent } from './swagger-ui/swagger-ui.component';
import {UsersComponent} from "./users/users.component";

const routes: Routes = [
  { path: 'user', component: UsersComponent },
  { path: 'swagger', component: SwaggerUiComponent },
  { path: 'grafana', component: GrafanaComponent },
  { path: '', component: HomeComponent },
  { path: '**', redirectTo: 'home', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
