import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { Session } from '../models/sessions';
import { DisplaySessionsComponent } from '../display-sessions/display-sessions.component';
import { SessionsService } from '../sessions.service';

@Component({
  selector: 'app-add-sessions',
  templateUrl: './add-sessions.component.html',
  styleUrls: ['./add-sessions.component.css']
})
export class AddSessionsComponent implements OnInit {

  sessionForm!: FormGroup;
  sessionToDelete:Session | undefined;
  

  constructor(private sessionService:SessionsService, private dialogRef:MatDialogRef<DisplaySessionsComponent>) {  }

  ngOnInit(): void {
    this.sessionForm = new FormGroup({
      sessionName : new FormControl('', Validators.required),
      instructorName : new FormControl('', Validators.required),
      description : new FormControl('')
    });
  }

  get sessionName() {
    return this.sessionForm.get('sessionName') as FormControl;
  }

  get instructorName() {
    return this.sessionForm.get('instructorName') as FormControl;
  }


  get description() {
    return this.sessionForm.get('description') as FormControl;
  }

  addToList(){
    const session:Session = {
      sessionName : this.sessionName.value,
      instructorName: this.instructorName.value,
      description : this.description.value
    }
    this.sessionService.addSessions(session);
    this.dialogRef.close();
  }

  deleteSession(sessionToDelete: Session){
    this.sessionService.deleteSession(sessionToDelete) 
  }

}
