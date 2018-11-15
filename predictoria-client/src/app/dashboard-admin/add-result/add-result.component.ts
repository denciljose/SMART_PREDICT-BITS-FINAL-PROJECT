import { Component, OnInit } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import {NewGameComponent} from '../new-game/new-game.component';
import { HttpClient } from '@angular/common/http';

export interface Game {
  team1: string;
  team2: string;
  position: number;
  date: string;
  result: string;
}

const ELEMENT_DATA: Game[] = [
 {team1:'India', team2:'Australia',position:1,date:'11/10/2018', result:''},
 {team1:'India', team2:'Australia',position:2,date:'11/10/2018', result:''},
 {team1:'India', team2:'Australia',position:3,date:'11/10/2018', result:''},
];

@Component({
  selector: 'app-add-result',
  templateUrl: './add-result.component.html',
  styleUrls: ['./add-result.component.css']
})
export class AddResultComponent implements OnInit {
  displayedColumns: string[] = ['position', 'team1', 'team2', 'date', 'result', 'actions'];
  dataSource:Game[]; // = ELEMENT_DATA; //TODO remove this line once cors is set

  constructor(public dialog: MatDialog, private http: HttpClient) {
    this.getResults();
  }
  
  getResults(){
    const resultGetUrl = 'http://localhost:9091/api/predictList';
    this.http.get<Game[]>(resultGetUrl).subscribe(res=>{
      this.dataSource = res;
    });
  }

  createGame(data:Game){
    const resultGetUrl = 'http://localhost:9091/api/SavePredict';
    this.http.post<Game>(resultGetUrl,data).subscribe(res=>{
      this.getResults();
    });
  }

  saveGame(data:Game){
    const resultGetUrl = 'http://localhost:9091/api/UpatepredictList';
    this.http.post<Game>(resultGetUrl,data).subscribe(res=>{
      this.getResults();
    });
  }

  ngOnInit() {
  }

  editButtonClick(item:Game):void {
    const dialogRef = this.dialog.open(NewGameComponent, {
      data: item
    });

    dialogRef.afterClosed().subscribe(result => {
      this.saveGame(result)
    });
  }

  addButtonClick():void {
    let item:Game = {
      team1: '',
      team2: '',
      position: 0,
      date: '',
      result: '',
    };
    const dialogRef = this.dialog.open(NewGameComponent, {
      data: item
    });

    dialogRef.afterClosed().subscribe(result => {
      this.createGame(result)
    });
  }

}
