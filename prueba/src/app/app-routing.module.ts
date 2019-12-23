import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { OptionsComponent } from './options/options.component';
import { ListComponent } from './list/list.component';
import { SearchComponent } from './search/search.component';


const routes: Routes = [
  {path:'user', component:UserComponent},
  {path:'options', component:OptionsComponent},
  {path:'register', component:RegisterComponent},
  {path:'list', component:ListComponent},
  {path:'search', component:SearchComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
