import { Component, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { FormGroup, FormControl, Validators } from '@angular/forms';

export interface Team {
  name:string,
  id:string
}
const TEAMS:Team[] =[
  { id:'1', name:'India' },
  { id:'2', name:'Australia' },
];
@Component({
  selector: 'app-new-game',
  templateUrl: './new-game.component.html',
  styleUrls: ['./new-game.component.css']
})
export class NewGameComponent{
  public gameForm: FormGroup;
  Teams = TEAMS;

  constructor(
    public dialogRef: MatDialogRef<NewGameComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.gameForm = new FormGroup({
        team1: new FormControl(data.team1,Validators.required),
        team2:new FormControl(data.team2,Validators.required),
        position:new FormControl(data.position,Validators.required),
        date:new FormControl(new Date(data.date),Validators.required),
        result:new FormControl(data.result),
      });
    }

  onCancelClick(): void {
    this.dialogRef.close();
  }
  onSubmit(): void {
    this.dialogRef.close(this.gameForm.value);
  }
}
