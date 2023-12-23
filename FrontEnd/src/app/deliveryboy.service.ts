import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Deliveryboy } from './deliveryboy';
@Injectable({
  providedIn: 'root'
})
export class DeliveryboyService {
  private baseURL = "http://localhost:8080/deliveryboy";
  constructor(private httpClient: HttpClient ) { }
  getList(): Observable<Deliveryboy[]>{
    return this.httpClient.get<Deliveryboy[]>(`${this.baseURL}`);
  }

  create(uL: Deliveryboy): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, uL);
  }

  getById(loginid: String): Observable<Deliveryboy>{
    return this.httpClient.get<Deliveryboy>(`${this.baseURL}/${loginid}`);
  }

  update(loginid: String, uL: Deliveryboy): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${loginid}`, uL);
  }

  delete(loginid: String): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${loginid}`);
  }
}
