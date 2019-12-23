import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ServiceService } from '../Service/service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }

  user: FormGroup;
  emailpattern:  any= /^[a-z]+[a-z0-9._]+@[a-z]+\.[a-z.]{2,5}$/;


  ngOnInit() {
    this.user = new FormGroup({
      name: new FormControl('', Validators.required, ),
        password: new FormControl('', [Validators.required,Validators.minLength(10)]),
     email: new  FormControl('',[Validators.required, Validators.pattern(this.emailpattern)])  
    });
  }

  onSubmit(){
   if(this.user.valid) {
  this.service.getUser(this.user.value)  
  alert("Registro exitoso"); 
this.router.navigate(['user']); 
    
   }
  }
}
