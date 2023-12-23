import { Component, OnInit } from '@angular/core';
import { Medicinerecords } from '../medicinerecords';
import { MedicinerecordsService } from '../medicinerecords.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-updatemedicinerecord',
  templateUrl: './updatemedicinerecord.component.html',
  styleUrl: './updatemedicinerecord.component.css'
})
export class UpdatemedicinerecordComponent implements OnInit{
  id!: number;
  mR: Medicinerecords= new Medicinerecords();
  constructor(private service: MedicinerecordsService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.service.getById(this.id).subscribe(data => {
      this.mR = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.service.update(this.id, this.mR).subscribe( data =>{
      this.goToList();
    }, 
    error => console.log(error));
  }
  goToList(){
    this.router.navigate(['/adminacess']);
  }


}
