import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Userlogin } from './userlogin';
@Injectable({
  providedIn: 'root'
})
export class UserloginService {
  private baseURL = "http://localhost:8080/userlogin";
  constructor(private httpClient: HttpClient) { }
  getList(): Observable<Userlogin[]>{
    return this.httpClient.get<Userlogin[]>(`${this.baseURL}`);
  }

  create(uL: Userlogin): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, uL);
  }

  getById(id: String): Observable<Userlogin>{
    return this.httpClient.get<Userlogin>(`${this.baseURL}/${id}`);
  }

  update(id: String, uL: Userlogin): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, uL);
  }

  delete(id: String): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
