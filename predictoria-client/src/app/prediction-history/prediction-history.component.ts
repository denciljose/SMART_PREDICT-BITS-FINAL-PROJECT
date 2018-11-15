import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import { HttpClient } from '@angular/common/http';
import {MatSnackBar} from '@angular/material';

export interface Prediction {
  gameId:string;
  userPredictId:string;
  date: string;
  team1: string;
  team2: string;
  prediction: string;
  result: string;
  userId?: string;
}
export interface Team {
  name:string,
  id:string
}
const TEAMS:Team[] =[
  { id:'1', name:'India' },
  { id:'2', name:'Australia' },
];

const ELEMENT_DATA: Prediction[] = [
  {userPredictId: '1', gameId:'1', team1:'India', team2:'Australia', prediction:'India', date:'11/10/2018', result:''},
  {userPredictId: '1', gameId:'1', team1:'India', team2:'Australia', prediction:'India', date:'11/10/2018', result:''},
  {userPredictId: '1', gameId:'1', team1:'India', team2:'Australia', prediction:'India', date:'11/10/2018', result:''},
 ];

@Component({
  selector: 'app-prediction-history',
  templateUrl: './prediction-history.component.html',
  styleUrls: ['./prediction-history.component.css']
})
export class PredictionHistoryComponent implements OnInit {

  Teams:Team[] = TEAMS;
  userId:string;
  displayedColumns: string[] = ['team1', 'team2', 'date', 'prediction', 'result', 'actions'];
  dataSource:Prediction[] = ELEMENT_DATA; 

  constructor(private route: ActivatedRoute, private http: HttpClient, public snackBar: MatSnackBar) { }

  ngOnInit() {
    this.route.params.subscribe( params => {
      this.userId = params['userId'];
      this.getPredictions();
    });
  }

  getPredictions(){
    var reqUrl = `http://localhost:9091/api/userpredictList/${this.userId}`;
    this.http.get<Prediction[]>(reqUrl).subscribe(res=>{
      this.dataSource = res;
    });
  }

  predict(item:Prediction){
    item.userId = this.userId;
    const resultGetUrl = 'http://localhost:9091/api/SaveUserPrediction';
    this.http.post<Prediction>(resultGetUrl,item).subscribe(res=>{
      this.snackBar.open('Success','',{duration:2000});
      this.getPredictions();
    },
    err=>{
      this.snackBar.open('Unable to make prediction !','',{duration:2000});
    }
    );
  }
}
