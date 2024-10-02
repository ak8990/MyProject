import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'StudentManagementSystem';
  
  baseUrl="http://localhost:8080/s";
  whatToShow=1;
  loginId: any; 
}
