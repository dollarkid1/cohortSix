package com.wimpsMobile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {
    MobilePhone henryIphone;
    MobilePhone mikePhone;
    MobilePhone henrySony;

   @BeforeEach
    void setup(){
       this.mikePhone = new MobilePhone("mikePhone", PhoneManufacturer.APPLE);
       mikePhone.setModel("iPhone X's max");
       mikePhone.setStorageSpace(512);
       mikePhone.makeCall(70100106);
       MobilePhone.setSimCardSlot(1);

       henryIphone = new MobilePhone("henryPhone", PhoneManufacturer.SAMSUNG, "iPhone 8",512 );
       henryIphone.makeCall(832082133);
       henrySony = new MobilePhone("henrySony", PhoneManufacturer.SONY, "Galaxy A210", 402);

   }
   @Test
    void showSimCardSlots(){
       System.out.println("slot count in Mike's iPhone is " + mikePhone.getSimCardSlot());
       System.out.println("slot count in Henry's Sony is " + henrySony.getSimCardSlot());
       System.out.println("slot count in Henry's Samsung is " + henryIphone.getSimCardSlot());

   }
   @Test
    void add(){
       int a=11,b=22,c;
       c = a+b + a++ + b++ + ++a + ++b;
       System.out.println(c   );
   }


}