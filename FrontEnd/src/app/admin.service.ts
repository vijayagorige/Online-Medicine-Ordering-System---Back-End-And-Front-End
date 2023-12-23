import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Admin } from './admin';
@Injectable({
  providedIn: 'root'
})
export class AdminService {
  private baseURL = "http://localhost:8080/admin";
  constructor(private httpClient: HttpClient) { }

  getById(loginid: String): Observable<Admin>{
    return this.httpClient.get<Admin>(`${this.baseURL}/${loginid}`);
  }

}
