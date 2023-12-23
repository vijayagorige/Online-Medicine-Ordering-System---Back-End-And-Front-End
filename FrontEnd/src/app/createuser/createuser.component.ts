import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-createuser',
  templateUrl: './createuser.component.html',
  styleUrl: './createuser.component.css'
})
export class CreateuserComponent implements OnInit {
  uL: User = new User();
  constructor(private service: UserService,
    private router: Router) { 
      
    }

  ngOnInit(): void {
  }

  saveUser(){
    this.service.create(this.uL).subscribe( data =>{
      console.log(data);
      this.goToList();
    },error => console.log(error));
  }

  goToList(){
    this.router.navigate(['']);
  }
  onSubmit(){
    console.log(this.uL);
    this.saveUser();
  }

}
