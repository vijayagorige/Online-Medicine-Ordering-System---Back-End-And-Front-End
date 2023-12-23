import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Deliveryboy } from '../deliveryboy';
import { DeliveryboyService } from '../deliveryboy.service';
@Component({
  selector: 'app-createdeliveryboy',
  templateUrl: './createdeliveryboy.component.html',
  styleUrl: './createdeliveryboy.component.css'
})
export class CreatedeliveryboyComponent implements OnInit{
  uL: Deliveryboy = new Deliveryboy();
  constructor(private service: DeliveryboyService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveUser(){
    this.service.create(this.uL).subscribe( data =>{
      console.log(data);
      this.goToList();
    },error => console.log(error));
  }

  goToList(){
    this.router.navigate(['adminacess/deliverylist']);
  }
  onSubmit(){
    console.log(this.uL);
    this.saveUser();
  }

}
