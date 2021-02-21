import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddSessionsComponent } from './add-sessions/add-sessions.component';
import { DisplaySessionsComponent } from './display-sessions/display-sessions.component';

const routes: Routes = [
  {
    path:'list',
    component:DisplaySessionsComponent,
  },
  {
    path:'add',
    component:AddSessionsComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
