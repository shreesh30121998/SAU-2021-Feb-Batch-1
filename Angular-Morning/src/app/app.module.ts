import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InfoComponent } from './info/info.component';
import {FormsModule} from '@angular/forms';
import {RecordsService} from './records.service';

@NgModule({
  declarations: [
    AppComponent,
    InfoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [RecordsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
