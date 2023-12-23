import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Medicinerecords } from '../medicinerecords';
import { MedicinerecordsService } from '../medicinerecords.service';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent implements OnInit{
  mRS!: Medicinerecords[];

  constructor(private service: MedicinerecordsService,
    private router: Router) { }

  ngOnInit(): void {
    this.getMed();
  }

  private getMed(){
    this.service.getList().subscribe(data => {
      this.mRS = data;
    });
  }
  details(id: number){
    this.router.navigate(['getrecord', id]);
  }

}
