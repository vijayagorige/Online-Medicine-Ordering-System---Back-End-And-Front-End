import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { User } from '../user';
@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrl: './userlist.component.css'
})
export class UserlistComponent implements OnInit{
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
  update(userId: String){
    this.router.navigate(['put', userId]);
  }

  delete(userId: String){
    this.service.delete(userId).subscribe( data => {
      console.log(data);
      this.getUser();
    })
  }

}
