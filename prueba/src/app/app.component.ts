import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'prueba';


constructor(private router:Router){}


user(){
   this.router.navigate(["user"])
 }

 register(){
  this.router.navigate(["register"])
}
}