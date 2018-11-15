import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DashboardAdminComponent } from './dashboard-admin/dashboard-admin.component';
import { RegisterComponent } from './register/register.component';
import { PredictionHistoryComponent } from './prediction-history/prediction-history.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'dashboard/:userId', component: DashboardComponent },
  { path: 'dashboardAdmin/:userId', component: DashboardAdminComponent },
  { path: 'history/:userId', component: PredictionHistoryComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
