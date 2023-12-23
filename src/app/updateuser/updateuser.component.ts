import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrl: './updateuser.component.css'
})
export class UpdateuserComponent implements OnInit {
  userId!: String;
  uL: User= new User();
  constructor(private service: UserService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.userId = this.route.snapshot.params['id'];

    this.service.getById(this.userId).subscribe(data => {
      this.uL = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.service.update(this.userId, this.uL).subscribe( data =>{
      this.goToList();
    }, 
    error => console.log(error));
  }
  goToList(){
    this.router.navigate(['/profile/userlist']);
  }


}
