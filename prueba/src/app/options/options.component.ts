import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../Service/service.service';

@Component({
  selector: 'app-options',
  templateUrl: './options.component.html',
  styleUrls: ['./options.component.css']
})
export class OptionsComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }

  ngOnInit() {
  }
  
    registrar(){
      
      alert("Registro exitoso"); 
    }
    actualizar(){
      alert("Registro Actualizado"); 
    }
    search(){
this.router.navigate(['search']); 
    }

    list(){
      this.router.navigate(['list']);  
    }




  
}
