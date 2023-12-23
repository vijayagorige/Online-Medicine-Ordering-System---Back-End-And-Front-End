import { Component, OnInit } from '@angular/core';
import { Userpurchasedetails } from '../userpurchasedetails';
import { UserpurchasedetailsService } from '../userpurchasedetails.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-viewpurchasedetails',
  templateUrl: './viewpurchasedetails.component.html',
  styleUrl: './viewpurchasedetails.component.css'
})
export class ViewpurchasedetailsComponent implements OnInit {
  orderNo!: number
  uL!: Userpurchasedetails
  constructor(private route: ActivatedRoute, private service: UserpurchasedetailsService) { }

  ngOnInit(): void {
    this.orderNo= this.route.snapshot.params['id'];

    this.uL = new Userpurchasedetails();
    this.service.getById(this.orderNo).subscribe( data => {
      this.uL = data;
    });
  }

}
