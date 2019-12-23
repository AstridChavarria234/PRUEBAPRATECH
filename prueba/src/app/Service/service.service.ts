import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http' ;
import { User } from '../Modules/User';
import { Employee } from '../Modules/Employee';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  constructor(private http:HttpClient) {  }
    
  Url= 'http://localhost:8080/Pratech/user';
   
    getUser(user:User){
      return this.http.get<boolean>(this.Url + "/" +user.name + "/" +user.password);
   }

   addUser(user:User){
    return this.http.post<User>(this.Url,user);
   }

   Url1= 'http://localhost:8080/Pratech/api';

   listEmployee(){
 
   }

   createEmployee(employ:Employee){
      return this.http.post<Employee>(this.Url1,employ);

   }

   deleteEmployee(employ:Employee){
  
   }

  

}