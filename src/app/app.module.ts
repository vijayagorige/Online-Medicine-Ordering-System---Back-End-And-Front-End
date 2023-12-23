import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginlistComponent } from './loginlist/loginlist.component';
import { CreateuserloginComponent } from './createuserlogin/createuserlogin.component';
import { UpdateloginComponent } from './updatelogin/updatelogin.component';
import { ViewloginComponent } from './viewlogin/viewlogin.component';
import { FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserlistComponent } from './userlist/userlist.component';
import { CreateuserComponent } from './createuser/createuser.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { MedicinelistComponent } from './medicinelist/medicinelist.component';
import { CreatemedicinerecordComponent } from './createmedicinerecord/createmedicinerecord.component';
import { UpdatemedicinerecordComponent } from './updatemedicinerecord/updatemedicinerecord.component';
import { ViewmedicinerecordComponent } from './viewmedicinerecord/viewmedicinerecord.component';
import { PurchasedetailslistComponent } from './purchasedetailslist/purchasedetailslist.component';
import { CreatepurchasedetailsComponent } from './createpurchasedetails/createpurchasedetails.component';
import { UpdatepurchasedetailsComponent } from './updatepurchasedetails/updatepurchasedetails.component';
import { ViewpurchasedetailsComponent } from './viewpurchasedetails/viewpurchasedetails.component';
import { DeliveryboylistComponent } from './deliveryboylist/deliveryboylist.component';
import { CreatedeliveryboyComponent } from './createdeliveryboy/createdeliveryboy.component';
import { UpdatedeliveryComponent } from './updatedelivery/updatedelivery.component';
import { ViewdeliveryComponent } from './viewdelivery/viewdelivery.component';
import { HomeComponent } from './home/home.component';
import { ViewadminComponent } from './viewadmin/viewadmin.component';
import { ProfileComponent } from './profile/profile.component';
import { DeliveryComponent } from './delivery/delivery.component';
import { AdminacessComponent } from './adminacess/adminacess.component';
import { AdmindelComponent } from './admindel/admindel.component';
import { AdminpurComponent } from './adminpur/adminpur.component';
import { AdminuserlistComponent } from './adminuserlist/adminuserlist.component';
import { PaymentComponent } from './payment/payment.component';
import { PaidComponent } from './paid/paid.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { DeliveryhomeComponent } from './deliveryhome/deliveryhome.component';
@NgModule({
  declarations: [
    AppComponent,
    
    LoginlistComponent,
    CreateuserloginComponent,
    UpdateloginComponent,
    ViewloginComponent,

    UserlistComponent,
    CreateuserComponent,
    UpdateuserComponent,
    ViewuserComponent,
    
    MedicinelistComponent,
    CreatemedicinerecordComponent,
    UpdatemedicinerecordComponent,
    ViewmedicinerecordComponent,

    PurchasedetailslistComponent,
    CreatepurchasedetailsComponent,
    UpdatepurchasedetailsComponent,
    ViewpurchasedetailsComponent,
    
    DeliveryboylistComponent,
    CreatedeliveryboyComponent,
    UpdatedeliveryComponent,
    ViewdeliveryComponent,

    HomeComponent,
    
    ViewadminComponent,

    ProfileComponent,
     DeliveryComponent,
     AdminacessComponent,
     AdmindelComponent,
     AdminpurComponent,
     AdminuserlistComponent,
     PaymentComponent,
     PaidComponent,
     AdminhomeComponent,
     DeliveryhomeComponent,
        
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
