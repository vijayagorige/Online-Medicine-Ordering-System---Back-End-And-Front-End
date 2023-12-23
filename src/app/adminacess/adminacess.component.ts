import { Component, OnInit } from '@angular/core';
import { Medicinerecords } from '../medicinerecords';
import { MedicinerecordsService } from '../medicinerecords.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminacess',
  templateUrl: './adminacess.component.html',
  styleUrl: './adminacess.component.css'
})
export class AdminacessComponent implements OnInit{
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
  update(id: number){
    this.router.navigate(['putrecord', id]);
  }

  delete(id: number){
    this.service.delete(id).subscribe( data => {
      console.log(data);
      this.getMed();
    })
  }
 
}
