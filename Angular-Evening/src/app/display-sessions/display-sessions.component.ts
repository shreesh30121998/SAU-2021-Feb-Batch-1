import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { AddSessionsComponent } from '../add-sessions/add-sessions.component';
import { Session } from '../models/sessions';
import { SessionsService } from "../sessions.service";
import { UpdateSessionsComponent } from '../update-sessions/update-sessions.component';
@Component({
  selector: 'app-display-sessions',
  templateUrl: './display-sessions.component.html',
  styleUrls: ['./display-sessions.component.css']
})
export class DisplaySessionsComponent implements OnInit {

  sessionItems!: Session[];

  

  constructor(private sessionService:SessionsService, private dialog:MatDialog) {}

  ngOnInit(): void {
    this.sessionItems = this.sessionService.getSession();
  }

  addSession(){
    this.dialog.open(AddSessionsComponent, {
      width:'300px'
    });
  }

  updateSession(i:number){
    this.dialog.open(UpdateSessionsComponent, {
      width:'300px',
      data: { sessionname: this.sessionService.sessionItems[i].sessionName, 
              instructorname: this.sessionService.sessionItems[i].instructorName,
              description: this.sessionService.sessionItems[i].description,
              index:i
           },
      
    });
  }

  deleteSession(session:Session){
    if(this.sessionService.deleteSession(session)){
      return this.sessionService.getSession();
    }
    return this.sessionService.getSession();
  }

}