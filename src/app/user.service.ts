import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseURL = "http://localhost:8080/user";
  constructor(private httpClient: HttpClient) { }
  getList(): Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.baseURL}`);
  }

  create(uL: User): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, uL);
  }

  getById(userId: String): Observable<User>{
    return this.httpClient.get<User>(`${this.baseURL}/${userId}`);
  }

  update(userId: String, uL: User): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${userId}`, uL);
  }

  delete(userId: String): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${userId}`);
  }
}
