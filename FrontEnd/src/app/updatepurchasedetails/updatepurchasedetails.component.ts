import { Component, OnInit } from '@angular/core';
import { Userpurchasedetails } from '../userpurchasedetails';
import { UserpurchasedetailsService } from '../userpurchasedetails.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-updatepurchasedetails',
  templateUrl: './updatepurchasedetails.component.html',
  styleUrl: './updatepurchasedetails.component.css'
})
export class UpdatepurchasedetailsComponent implements OnInit{
  orderNo!: number;
  uL: Userpurchasedetails= new Userpurchasedetails();
  constructor(private service: UserpurchasedetailsService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.orderNo = this.route.snapshot.params['id'];

    this.service.getById(this.orderNo).subscribe(data => {
      this.uL = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.service.update(this.orderNo, this.uL).subscribe( data =>{
      this.goToList();
    }, 
    error => console.log(error));
  }
  goToList(){
    this.router.navigate(['/profile/purchaselist']);
  }

}
