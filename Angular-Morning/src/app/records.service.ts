import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RecordsService {

  box:string="";
  time: Date | undefined;
  constructor() { }
}
