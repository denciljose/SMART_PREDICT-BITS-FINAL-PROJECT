import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { UserResult } from '../user-result';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {
  @Input() userId: string;

  displayedColumns: string[] = ['rank', 'username', 'score', 'hvpscore'];
  dataSource;

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.getResults();
  }

  getResults(){
    const resultGetUrl = 'http://localhost:9091/api/userResults';
    this.http.get<UserResult[]>(resultGetUrl).subscribe(res=>{
      this.dataSource = res;
    });
  }
}
