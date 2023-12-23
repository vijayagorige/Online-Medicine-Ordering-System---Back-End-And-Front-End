import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
@Component({
  selector: 'app-viewadmin',
  templateUrl: './viewadmin.component.html',
  styleUrl: './viewadmin.component.css'
})
export class ViewadminComponent implements OnInit{
  loginid!: String
  uL!: Admin
  constructor(private route: ActivatedRoute, private service: AdminService) { }

  ngOnInit(): void {
    this.loginid = this.route.snapshot.params['id'];

    this.uL = new Admin();
    this.service.getById(this.loginid).subscribe( data => {
      this.uL = data;
    });
  }
}
