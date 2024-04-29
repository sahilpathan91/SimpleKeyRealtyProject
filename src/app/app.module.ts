import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PropertiesComponent } from './properties/properties.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { AgentsComponent } from './agents/agents.component';
import { RouterModule, Routes } from '@angular/router';
import { HistoryComponent } from './history/history.component';
import { FooterComponent } from './footer/footer.component';
import { SignUpComponent } from './sign-up/sign-up.component';


const appRoute:Routes=[
  
  {path:'Properties',component:PropertiesComponent},
  {path:'About',component:AboutComponent},
  {path:'ContactUs',component:ContactComponent},
  {path:'Agents',component: AgentsComponent},
  {path:'History',component:HistoryComponent},
  {path:'login',component:LoginComponent},
  {path:'Signup',component:SignUpComponent}

];
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    PropertiesComponent,
    AboutComponent,
    ContactComponent,
    AgentsComponent,
    HistoryComponent,
    FooterComponent,
    SignUpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoute)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
