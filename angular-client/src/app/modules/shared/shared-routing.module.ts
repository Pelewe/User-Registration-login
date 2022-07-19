import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CommonShellComponent } from './components/common-shell/common-shell.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {
    path: '',
    component: CommonShellComponent,
    children: [ 
      {
        path: 'home',
        loadChildren: () => import('../../modules/home/home.module').then(m => m.HomeModule),
      },
      { path: 'login', component: LoginComponent },
      { path: 'register', component: RegisterComponent },
      {
        path: '',
        redirectTo: 'home',
        pathMatch:'full'
      }
    ]
  },
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SharedRoutingModule { }