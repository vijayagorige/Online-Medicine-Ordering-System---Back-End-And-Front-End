import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Deliveryboy } from '../deliveryboy';
import { DeliveryboyService } from '../deliveryboy.service';
@Component({
  selector: 'app-viewdelivery',
  templateUrl: './viewdelivery.component.html',
  styleUrl: './viewdelivery.component.css'
})
export class ViewdeliveryComponent implements OnInit{
  loginid!: String
  uL!: Deliveryboy
  constructor(private route: ActivatedRoute, private service: DeliveryboyService) { }

  ngOnInit(): void {
    this.loginid = this.route.snapshot.params['id'];

    this.uL = new Deliveryboy();
    this.service.getById(this.loginid).subscribe( data => {
      this.uL = data;
    });
  }

}
