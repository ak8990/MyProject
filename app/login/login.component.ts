import { Component } from '@angular/core';
import { AppComponent } from '../app.component';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(public app:AppComponent, public http:HttpClient)
  {
    
  }
  password="";
  mobile:any;
  
  login()
  {
    let obj=
    {
      "password":this.password,
      "mobile":this.mobile
    }

      let url=this.app.baseUrl+"login";
      this.http.post(url,obj).subscribe((data:any)=>
    {
      if(data==-3)
        window.alert("Wrong PassWord");
      if(data==-4)
        window.alert("Duplicate Data");
      if(data==-2)
        window.alert("wrong Mobile");
      if(data==-1)
        window.alert("Server Issue");
      if(data<-3)
        window.alert("Your Da;ta Is duplicate")
      if(data>0)
        {
          this.app.whatToShow=3;
          window.alert("WelCome Your Login Succesfully")
          this.app.loginId=data;
          
        }
    })
  }
  
  

}
