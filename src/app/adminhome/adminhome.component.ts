import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminhome',
  templateUrl: './adminhome.component.html',
  styleUrl: './adminhome.component.css'
})
export class AdminhomeComponent {
  uL = { loginid: '', password: '' };

  constructor(private router: Router) {}

  onSubmit() {

    // Check if loginid is 'sadaf' and password is 'kazmi'
    if (this.uL.loginid === 'sadaf' && this.uL.password === 'kazmi') {
      // Navigate to "adminacess" page
      this.router.navigate(['/adminacess']);
    } else {
      // Handle incorrect login credentials 
      console.log('Invalid login credentials');
    }
  }
}
