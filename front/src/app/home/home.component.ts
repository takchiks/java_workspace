import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

 //message:any;
  products:any;

  constructor(private service:ProductService, private router:Router) { 
    
  }

  ngOnInit(): void {
    
    this.service.getProducts().subscribe(res=>{
      this.products = res;
    })


  }

  moreDetails(id:any) {
    alert("inside moredetails() "+id)

    this.router.navigate([('/pdp/'+id)])
  }

}
