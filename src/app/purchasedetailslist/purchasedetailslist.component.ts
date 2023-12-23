import { Component, OnInit } from '@angular/core';
import { Userpurchasedetails } from '../userpurchasedetails';
import { UserpurchasedetailsService } from '../userpurchasedetails.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-purchasedetailslist',
  templateUrl: './purchasedetailslist.component.html',
  styleUrl: './purchasedetailslist.component.css'
})
export class PurchasedetailslistComponent implements OnInit{
  uLS!: Userpurchasedetails[];

  constructor(private service: UserpurchasedetailsService,
    private router: Router) { }

  ngOnInit(): void {
    this.getMed();
  }

  private getMed(){
    this.service.getList().subscribe(data => {
      this.uLS = data;
    });
  }

  details(orderNo: number){
    this.router.navigate(['getdetail', orderNo]);
  }
  update(orderNo: number){
    this.router.navigate(['putdetail', orderNo]);
  }

  delete(orderNo: number){
    this.service.delete(orderNo).subscribe( data => {
      console.log(data);
      this.getMed();
    })
  }
}
