import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  getMessage() {
    return this.http.get("http://localhost:8080/message", { responseType: 'text' });
  }

  getProducts() {
    return this.http.get("http://localhost:8080/getProducts");
  }

  getProductById(id:any) {
    return this.http.get("http://localhost:8080/getProduct/"+id);
  }
}
