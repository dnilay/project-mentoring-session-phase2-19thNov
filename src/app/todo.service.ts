import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Todo} from "./todo";
@Injectable({
  providedIn: 'root'
})
export class TodoService {

  private baseUrl = 'http://localhost:8081';
  constructor(private httpClient:HttpClient) {   }

  getTodos(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(this.baseUrl + '/api/todos/');
  }
}
