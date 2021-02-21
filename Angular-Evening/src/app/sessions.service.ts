import { Injectable } from '@angular/core';
import { Session } from './models/sessions';
@Injectable({
  providedIn: 'root'
})
export class SessionsService {
  
  sessionItems: Session[] = [];
  getSession()
  {
    return this.sessionItems;
  }
  addSessions(session:Session) {
    this.sessionItems.push(session);
  }
  deleteSession(session:Session){
    for(let item of this.sessionItems){
        if((item.sessionName === session.sessionName) && (item.instructorName === session.instructorName) && (item.description===session.description)){
          this.sessionItems.splice(this.sessionItems.indexOf(item),1);
          return true;
        }

    }
    return false;
  }

  updateSession(index:number,session:Session){
    this.sessionItems[index].sessionName = session.sessionName;
    this.sessionItems[index].instructorName = session.instructorName;
    this.sessionItems[index].description = session.description;
  }
  
  constructor() { }
}
