import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from "@angular/router";
import {MatSnackBar} from '@angular/material';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm = new FormGroup({
    name: new FormControl('', Validators.required),
    userName: new FormControl('',Validators.required),
    password:new FormControl('',Validators.required),
    isAdmin: new FormControl(false)
  });

  constructor(private http: HttpClient, private router: Router, public snackBar: MatSnackBar) { }

  ngOnInit() {
  }
  
  onSubmit(){
    if(this.registerForm.valid){
      const resultGetUrl = `http://localhost:9091/api/registration`;
      this.http.post(resultGetUrl, this.registerForm.value).subscribe(res=>{
        this.router.navigate(['']);
      },
      err =>{
        this.snackBar.open('Faied, try using another username','Try again',{duration:2000});
      });
    }
  }

}
