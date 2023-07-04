import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GrafanaComponent } from './grafana/grafana.component';
import { HomeComponent } from './home/home.component';
import { SwaggerUiComponent } from './swagger-ui/swagger-ui.component';
import {UsersComponent} from "./users/users.component";
import {AuthGuard} from "./AuthGuard/auth-guard.guard";
import {SupportSessionComponent} from "./support-session/support-session.component";
import {ProductInstanceComponent} from "./product-instance/product-instance.component";
import {DepConfigComponent} from "./dep-config/dep-config.component";
import {VciComponent} from "./vci/vci.component";


const routes: Routes = [
  { path: 'user', component: UsersComponent ,canActivate: [AuthGuard]},
  { path: 'swagger', component: SwaggerUiComponent,canActivate: [AuthGuard] },
  { path: 'grafana', component: GrafanaComponent,canActivate: [AuthGuard] },
  { path: 'SupportSession', component: SupportSessionComponent,canActivate: [AuthGuard] },
  { path: 'ProductInstance', component: ProductInstanceComponent,canActivate: [AuthGuard] },
  { path: 'DepConfig', component: DepConfigComponent,canActivate: [AuthGuard] },
  { path: 'Vci', component: VciComponent,canActivate: [AuthGuard] },
  { path: '', component: HomeComponent,canActivate: [AuthGuard]},
  { path: '**', redirectTo: '',canActivate: [AuthGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
