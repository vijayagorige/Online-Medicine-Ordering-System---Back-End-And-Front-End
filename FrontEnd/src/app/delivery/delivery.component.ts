import { Component, OnInit } from '@angular/core';
import { Userpurchasedetails } from '../userpurchasedetails';
import { UserpurchasedetailsService } from '../userpurchasedetails.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-delivery',
  templateUrl: './delivery.component.html',
  styleUrl: './delivery.component.css'
})
export class DeliveryComponent implements OnInit {
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


}
