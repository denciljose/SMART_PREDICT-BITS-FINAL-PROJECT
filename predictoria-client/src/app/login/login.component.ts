import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from "@angular/router";
import {MatSnackBar} from '@angular/material';

export interface LoginResponse {
  userName: string,
  password: string,
  isAdmin: boolean
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm = new FormGroup({
    userName: new FormControl('',Validators.required),
    password:new FormControl('',Validators.required)
  });
  constructor(private http: HttpClient, private router: Router, public snackBar: MatSnackBar) { }

  ngOnInit() {
  }

  onSubmit(){
    if(this.loginForm.valid){
      const resultGetUrl = `http://localhost:9091/api/login`;
      this.http.post<LoginResponse>(resultGetUrl, this.loginForm.value).subscribe(res=>{
        if(!res) {
          this.snackBar.open('Invalid username or password !','Try again',{duration:2000});
          return;
        }
        if(res.isAdmin){
          this.router.navigate(['dashboardAdmin', res.userName]);
        }
        else{
          this.router.navigate(['dashboard', res.userName]);
        }
      });
    }
  }

  register(){
    this.router.navigate(['register']);
  }

}
