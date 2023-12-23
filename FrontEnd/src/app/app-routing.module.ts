import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginlistComponent } from './loginlist/loginlist.component';
import { CreateuserloginComponent } from './createuserlogin/createuserlogin.component';
import { UpdateloginComponent } from './updatelogin/updatelogin.component';
import { ViewloginComponent } from './viewlogin/viewlogin.component';
import { UserlistComponent } from './userlist/userlist.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { CreateuserComponent } from './createuser/createuser.component';
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
const routes: Routes = [
  {path: '', component: HomeComponent, pathMatch: 'full'},
  {path: 'profile', component: ProfileComponent},
  {path: 'delivery', component: DeliveryComponent},
  {path: 'adminacess/admin', component: ViewadminComponent},
  {path: 'adminacess', component: AdminacessComponent},
  {path: 'adminacess/deliverylist', component: AdmindelComponent},
  {path: 'adminacess/getdetail', component: AdminpurComponent},
  {path: 'adminacess/userlist', component: AdminuserlistComponent},
  {path: 'pay', component: PaymentComponent},
  {path: 'pay/paid', component: PaidComponent},
  {path: 'adhome', component: AdminhomeComponent},
  {path: 'delhome', component: DeliveryhomeComponent},

  {path: 'loginlist', component: LoginlistComponent},
  {path: 'add', component: CreateuserloginComponent},
  {path: 'update/:id', component: UpdateloginComponent},
  {path: 'details/:id', component: ViewloginComponent},

  {path: 'profile/userlist', component: UserlistComponent},
  {path: 'adduser', component: CreateuserComponent},
  {path: '', redirectTo: 'userlist', pathMatch: 'full'},
  {path: 'put/:id', component: UpdateuserComponent},
  {path: 'get/:id', component: ViewuserComponent},

  {path: 'profile/medicinelist', component: MedicinelistComponent},
  {path: 'adminacess/addrecord', component: CreatemedicinerecordComponent},
  {path: '', redirectTo: 'medicinelist', pathMatch: 'full'},
  {path: 'putrecord/:id', component: UpdatemedicinerecordComponent},
  {path: 'getrecord/:id', component: ViewmedicinerecordComponent},

  {path: 'profile/purchaselist', component: PurchasedetailslistComponent},
  {path: 'profile/addpurchase', component: CreatepurchasedetailsComponent},
  {path: '', redirectTo: 'purchaselist', pathMatch: 'full'},
  {path: 'putdetail/:id', component: UpdatepurchasedetailsComponent},
  {path: 'admin/getdetail/:id', component: ViewpurchasedetailsComponent},

  {path: 'delivery/deliverylist', component: DeliveryboylistComponent},
  {path: 'adminacess/deliverylist/adddelivery', component: CreatedeliveryboyComponent},
  {path: '', redirectTo: 'deliverylist', pathMatch: 'full'},
  {path: 'putdel/:id', component: UpdatedeliveryComponent},
  {path: 'getdel/:id', component: ViewdeliveryComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
