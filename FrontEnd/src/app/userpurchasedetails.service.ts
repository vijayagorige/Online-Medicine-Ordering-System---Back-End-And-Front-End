import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Userpurchasedetails } from './userpurchasedetails';
@Injectable({
  providedIn: 'root'
})
export class UserpurchasedetailsService {
  private baseURL = "http://localhost:8080/userpurchasedetails";
  constructor(private httpClient: HttpClient) { }
  getList(): Observable<Userpurchasedetails[]>{
    return this.httpClient.get<Userpurchasedetails[]>(`${this.baseURL}`);
  }

  create(uL: Userpurchasedetails): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, uL);
  }

  getById(orderNo: number): Observable<Userpurchasedetails>{
    return this.httpClient.get<Userpurchasedetails>(`${this.baseURL}/${orderNo}`);
  }

  update(orderNo: number, uL: Userpurchasedetails): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${orderNo}`, uL);
  }

  delete(orderNo: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${orderNo}`);
  }
}
