import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: [
    '../../styles/bootstrap-4.0.0-dist/css/bootstrap.min.css',
    './nav.component.css'
  ]
})
export class NavComponent implements OnInit {

  appTitle: string = 'myapp';

  constructor() { }

  ngOnInit() {
  }

}
