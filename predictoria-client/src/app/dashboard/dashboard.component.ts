import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import { HttpClient } from '@angular/common/http';
import { Router } from "@angular/router";
import { UserResult } from './user-result';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  userId:string;
  userInfo:UserResult = {
    rank:'',
    hvpscore:'',
    score:'',
    userName:''
  };

  constructor(private route: ActivatedRoute, private http: HttpClient, private router: Router) {
    this.route.params.subscribe( params => this.userId = params['userId'] );
   }

  ngOnInit() {
    this.getResults();
  }

  getResults(){
    const resultGetUrl = `http://localhost:9091/api/getUser/${this.userId}`;
    this.http.get<UserResult>(resultGetUrl).subscribe(res=>{
      this.userInfo = res;
    });
  }

  goToPredict(){
    this.router.navigate([`history/${this.userId}`]);
  }

}
