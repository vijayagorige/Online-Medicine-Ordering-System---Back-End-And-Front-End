import { Component, OnInit } from '@angular/core';
import { Deliveryboy } from '../deliveryboy';
import { DeliveryboyService } from '../deliveryboy.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-admindel',
  templateUrl: './admindel.component.html',
  styleUrl: './admindel.component.css'
})
export class AdmindelComponent implements OnInit{
  uLS!: Deliveryboy[];

  constructor(private service: DeliveryboyService,
    private router: Router) { }

  ngOnInit(): void {
    this.getUser();
  }

  private getUser(){
    this.service.getList().subscribe(data => {
      this.uLS = data;
    });
  }

  details(loginid: String){
    this.router.navigate(['getdel', loginid]);
  }
  update(loginid: String){
    this.router.navigate(['putdel', loginid]);
  }

  delete(loginid: String){
    this.service.delete(loginid).subscribe( data => {
      console.log(data);
      this.getUser();
    })
  }

}
