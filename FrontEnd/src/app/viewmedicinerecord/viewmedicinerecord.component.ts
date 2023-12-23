import { Component, OnInit } from '@angular/core';
import { Medicinerecords } from '../medicinerecords';
import { MedicinerecordsService } from '../medicinerecords.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-viewmedicinerecord',
  templateUrl: './viewmedicinerecord.component.html',
  styleUrl: './viewmedicinerecord.component.css'
})
export class ViewmedicinerecordComponent implements OnInit{
  id!: number
  mR!: Medicinerecords
  constructor(private route: ActivatedRoute, private service: MedicinerecordsService) { }

  ngOnInit(): void {
    this.id= this.route.snapshot.params['id'];

    this.mR = new Medicinerecords();
    this.service.getById(this.id).subscribe( data => {
      this.mR = data;
    });
  }

}
