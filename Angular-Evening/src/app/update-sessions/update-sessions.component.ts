import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { DisplaySessionsComponent } from '../display-sessions/display-sessions.component';
import { Session } from '../models/sessions';
import { SessionsService } from '../sessions.service';

@Component({
  selector: 'app-update-sessions',
  templateUrl: './update-sessions.component.html',
  styleUrls: ['./update-sessions.component.css']
})
export class UpdateSessionsComponent implements OnInit {

  sessionForm!: FormGroup;


  constructor(@Inject(MAT_DIALOG_DATA) public data: {sessionName: string,instructorName:string,description:string,index:number}, 
            private sessionService: SessionsService, private dialogRef:MatDialogRef<DisplaySessionsComponent>) { }

  ngOnInit(): void {
    this.sessionForm = new FormGroup({
      sessionName : new FormControl(this.data.sessionName, Validators.required),
      instructorName : new FormControl(this.data.instructorName, Validators.required),
      description : new FormControl(this.data.description)
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

  updateValue(){
    const session:Session = {
      sessionName : this.sessionName.value,
      instructorName: this.instructorName.value,
      description : this.description.value
    }
    this.sessionService.updateSession(this.data.index,session);
    this.dialogRef.close();
  }

}