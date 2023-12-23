import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Userlogin } from '../userlogin';
import { UserloginService } from '../userlogin.service';
@Component({
  selector: 'app-loginlist',
  templateUrl: './loginlist.component.html',
  styleUrl: './loginlist.component.css'
})
export class LoginlistComponent implements OnInit{
  uLS!: Userlogin[];

  constructor(private service: UserloginService,
    private router: Router) { }

  ngOnInit(): void {
    this.getLogin();
  }

  private getLogin(){
    this.service.getList().subscribe(data => {
      this.uLS = data;
    });
  }

  details(id: String){
    this.router.navigate(['details', id]);
  }
  update(id: String){
    this.router.navigate(['update', id]);
  }

  delete(id: String){
    this.service.delete(id).subscribe( data => {
      console.log(data);
      this.getLogin();
    })
  }

}
