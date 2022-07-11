import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private router:Router) {
    alert("inside const of RegisterComponent")
   }

  ngOnInit(): void {
  }

  register(form:any) {
    alert("inside register() "+form.username+", "+form.firstName+", "+form.lastName+", "+form.password+", "+form.phone);

    this.router.navigate([('/login')]);
  }

}
