import { Component, OnInit } from '@angular/core';
import { Userlogin } from '../userlogin';
import { UserloginService } from '../userlogin.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-viewlogin',
  templateUrl: './viewlogin.component.html',
  styleUrl: './viewlogin.component.css'
})
export class ViewloginComponent implements OnInit{
  id!: String
  uL!: Userlogin
  constructor(private route: ActivatedRoute, private service: UserloginService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.uL = new Userlogin();
    this.service.getById(this.id).subscribe( data => {
      this.uL = data;
    });
  }

}
