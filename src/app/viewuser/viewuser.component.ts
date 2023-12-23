import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrl: './viewuser.component.css'
})
export class ViewuserComponent implements OnInit {
  userId!: String
  uL!: User
  constructor(private route: ActivatedRoute, private service: UserService) { }

  ngOnInit(): void {
    this.userId = this.route.snapshot.params['id'];

    this.uL = new User();
    this.service.getById(this.userId).subscribe( data => {
      this.uL = data;
    });
  }

}
