import {NgModule, Inject, EventEmitter}  from '@angular/core';
import { bootstrap } from '@angular/platform-browser-dynamic';
import {AppComponent} from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpModule, HTTP_PROVIDERS} from '@angular/http';
import {BrowserModule} from '@angular/platform-browser';
import {ROUTER_DIRECTIVES, RouterModule} from '@angular/router';

import 'rxjs/add/operator/toPromise';
import { MultiSelectModule,
    TooltipModule,
    RadioButtonModule,
    GrowlModule,
    CalendarModule,
    InputTextModule,
    InputTextareaModule,
    DataTableModule,
    ButtonModule,
    DialogModule,
    DropdownModule,
    PanelModule,
    InputMaskModule,
    PasswordModule,
    CheckboxModule,
    MessagesModule,
    MenubarModule,
    DataGridModule,
    TreeModule } from 'primeng/primeng';

@NgModule({
    imports: [MultiSelectModule,
        TooltipModule,
        RadioButtonModule,
        ReactiveFormsModule,
        GrowlModule,
        BrowserModule,
        CalendarModule,
        InputTextModule,
        FormsModule,
        HttpModule,
        DataTableModule,
        ButtonModule,
        DialogModule,
        DropdownModule,
        PanelModule,
        InputMaskModule,
        PasswordModule,
        CheckboxModule,
        DataGridModule,
        MessagesModule,
        TreeModule,
        MenubarModule
        
    ],
    declarations: [AppComponent],

    bootstrap: [AppComponent],
    directives: [ROUTER_DIRECTIVES] 
})
export class AppModule { }
