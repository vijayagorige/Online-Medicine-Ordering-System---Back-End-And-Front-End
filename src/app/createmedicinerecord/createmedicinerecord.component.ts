import { Component, OnInit } from '@angular/core';
import { Medicinerecords } from '../medicinerecords';
import { MedicinerecordsService } from '../medicinerecords.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-createmedicinerecord',
  templateUrl: './createmedicinerecord.component.html',
  styleUrl: './createmedicinerecord.component.css'
})
export class CreatemedicinerecordComponent{
  mR: Medicinerecords = new Medicinerecords();
  constructor(private service: MedicinerecordsService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveRecord(){
    this.service.create(this.mR).subscribe( data =>{
      console.log(data);
      this.goToList();
    },error => console.log(error));
  }

  goToList(){
    this.router.navigate(['/adminacess']);
  }
  onSubmit(){
    console.log(this.mR);
    this.saveRecord();
  }


}
