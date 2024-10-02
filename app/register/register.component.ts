import { Component } from '@angular/core';
import { AppComponent } from '../app.component';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor(public app:AppComponent, public http:HttpClient)
  {

  }
  
  name="";
  password="";
  mobile:any;
  email="";

  register()
  {
    let obj=
    {
      "name":this.name,
      "password":this.password,
      "mobile":this.mobile,
      "email":this.email
    }
      console.log(obj);
    let url=this.app.baseUrl+"register";
    this.http.post(url,obj).subscribe((data:any)=>
    {
      console.log(data)
      if(data[0]=="name or password is null")
        window.alert("name or password is null");

      if(data[0]=="Mobile Number Is Incorrect")
        window.alert("Mobile Number Is Incorrect");

      if(data[0]=="Email Is Wrong")
        window.alert("Email Is Wrong");

      if(data[0]=="Mobile Is Duplicate")
        window.alert("Mobile Is Duplicate");

      if(data[0]=="Email Is Duplicate")
        window.alert("Email Is Duplicate");

      if(data[0]=="Server Issue")
        window.alert("Server Issue");

      if(data[0]=="Done, Please Login")
      {
        this.app.whatToShow=1;
        window.confirm("Login is Conform");
      }
      
    })
  }

}
