import { Component, OnInit } from '@angular/core';
import { Deliveryboy } from '../deliveryboy';
import { DeliveryboyService } from '../deliveryboy.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-updatedelivery',
  templateUrl: './updatedelivery.component.html',
  styleUrl: './updatedelivery.component.css'
})
export class UpdatedeliveryComponent implements OnInit{
  loginid!: String;
  uL: Deliveryboy= new Deliveryboy();
  constructor(private service: DeliveryboyService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.loginid = this.route.snapshot.params['id'];

    this.service.getById(this.loginid).subscribe(data => {
      this.uL = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.service.update(this.loginid, this.uL).subscribe( data =>{
      this.goToList();
    }, 
    error => console.log(error));
  }
  goToList(){
    this.router.navigate(['/deliverylist']);
  }
}
