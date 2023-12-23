import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Medicinerecords } from './medicinerecords';
@Injectable({
  providedIn: 'root'
})
export class MedicinerecordsService {
  private baseURL = "http://localhost:8080/records";

  constructor(private httpClient: HttpClient) { }
  getList(): Observable<Medicinerecords[]>{
    return this.httpClient.get<Medicinerecords[]>(`${this.baseURL}`);
  }

  create(mR: Medicinerecords): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, mR);
  }

  update(id: number, mR: Medicinerecords): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, mR);
  }

  delete(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

  getById( id:number): Observable<Medicinerecords>{
    return this.httpClient.get<Medicinerecords>(`${this.baseURL}/${id}`);
  }
}
