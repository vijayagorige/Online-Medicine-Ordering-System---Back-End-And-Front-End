import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Userpurchasedetails } from '../userpurchasedetails';
import { UserpurchasedetailsService } from '../userpurchasedetails.service';


@Component({
  selector: 'app-createpurchasedetails',
  templateUrl: './createpurchasedetails.component.html',
  styleUrl: './createpurchasedetails.component.css'
})
export class CreatepurchasedetailsComponent implements OnInit{
  uL: Userpurchasedetails = new Userpurchasedetails();
  
  constructor(private service: UserpurchasedetailsService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveRecord(){
    this.service.create(this.uL).subscribe( data =>{
      console.log(data);
      this.goToList();
    },error => console.log(error));
  }

  goToList(){
    this.router.navigate(['/pay']);
  }

 
  get amount(): number {
    // Perform your calculation logic here
    // Example: Sum of quantity and contactNo
    return this.uL.quantity * 6;
  }
  onSubmit(){
    if (!this.uL.userId) {
      alert('User ID is required.');
      return;
    }
    if (!this.uL.quantity) {
      alert('mention quantity.');
      return;
    }
    if (!this.uL.companyName) {
      alert('Company Name is required.');
      return;
    }
    console.log(this.uL);
    this.saveRecord();
  }

}
