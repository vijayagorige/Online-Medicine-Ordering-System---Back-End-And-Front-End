import { Component, OnInit } from '@angular/core';
import { Userlogin } from '../userlogin';
import { UserloginService } from '../userlogin.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-createuserlogin',
  templateUrl: './createuserlogin.component.html',
  styleUrl: './createuserlogin.component.css'
})
export class CreateuserloginComponent implements OnInit {
  uL: Userlogin = new Userlogin();
  constructor(private service: UserloginService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveLogin(){
    this.service.create(this.uL).subscribe( data =>{
      console.log(data);
      this.goToList();
    },error => console.log(error));
  }

  goToList(){
    this.router.navigate(['profile']);
  }
  onSubmit(){
    console.log(this.uL);
    this.saveLogin();
  }


}
