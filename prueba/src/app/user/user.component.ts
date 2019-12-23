import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ServiceService } from '../Service/service.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }

  user: FormGroup;
  ngOnInit() {
    this.user = new FormGroup({
      name: new FormControl('', Validators.required, ),
        password: new FormControl('', [Validators.required,Validators.minLength(8)])
        
    });
  }

  onSubmit(){
   if(this.user.valid) {
  //  this.service.getUser(this.user.value)  
  this.router.navigate(['options'])
    
   }
  }
}
