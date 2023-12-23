import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { User } from '../user';
@Component({
  selector: 'app-adminuserlist',
  templateUrl: './adminuserlist.component.html',
  styleUrl: './adminuserlist.component.css'
})
export class AdminuserlistComponent implements OnInit{
  uLS!: User[];

  constructor(private service: UserService,
    private router: Router) { }

  ngOnInit(): void {
    this.getUser();
  }

  private getUser(){
    this.service.getList().subscribe(data => {
      this.uLS = data;
    });
  }

  details(userId: String){
    this.router.navigate(['get', userId]);
  }

}
