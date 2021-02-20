import { RecordsService } from './../records.service';
import { Component, OnInit } from '@angular/core';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';


@Component({
  selector: 'info',
  templateUrl: './info.component.html',
  styleUrls: ['./info.component.scss']
})
export class InfoComponent implements OnInit {
  

  onInput(e:any)
  {
    this.myFirstService.box=e.target.value;
    this.myFirstService.time=new Date() ;
  }
  list: any[]=[];
  get data():any
  {
    
    if(this.myFirstService.box===undefined)
    {
      return [];
    }
    else
    {
      this.list.push(
        {
          data:this.myFirstService.box,
          time:this.myFirstService.time
        }
      );
      
    }
    return this.list;
  }
  constructor(private myFirstService:RecordsService) { }

  ngOnInit(): void {
  }

}
