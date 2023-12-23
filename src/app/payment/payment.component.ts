import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css'
})
export class PaymentComponent {
 
  constructor(private router: Router) {}
  selectedMethod: string = '';

  showPaymentFields() {
    // Reset selected method when the user changes the payment method
    this.selectedMethod = '';
  }

  processPayment() {
    // Simple console log indicating the payment method
    console.log(`Processing payment for ${this.selectedMethod}`);
    this.router.navigate(['/pay/paid']);
  }
}

