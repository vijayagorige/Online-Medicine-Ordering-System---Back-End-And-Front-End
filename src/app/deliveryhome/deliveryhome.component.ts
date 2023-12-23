import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-deliveryhome',
  templateUrl: './deliveryhome.component.html',
  styleUrl: './deliveryhome.component.css'
})
export class DeliveryhomeComponent {
  uL = { loginid: '', password: '' };

  constructor(private router: Router) {}

  onSubmit() {
    
    // Check if loginid is 'yash' and password is 'yash'
    if (this.uL.loginid === 'yash' && this.uL.password === 'yash') {
      // Navigate to "delivery" page
      this.router.navigate(['/delivery']);
    } else {
      // Handle incorrect login credentials 
      console.log('Invalid login credentials');
      
    }
  }
}
