import { Component, OnInit } from '@angular/core';
import { Userlogin } from '../userlogin';
import { UserloginService } from '../userlogin.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-updatelogin',
  templateUrl: './updatelogin.component.html',
  styleUrl: './updatelogin.component.css'
})
export class UpdateloginComponent implements OnInit{
  id!: String;
  uL: Userlogin= new Userlogin();
  constructor(private service: UserloginService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.service.getById(this.id).subscribe(data => {
      this.uL = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.service.update(this.id, this.uL).subscribe( data =>{
      this.goToList();
    }, 
    error => console.log(error));
  }
  goToList(){
    this.router.navigate(['/loginlist']);
  }

}
