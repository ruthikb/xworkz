package com.xworkz.hotel.hotel;

import com.xworkz.hotel.menu.Menu;


public class Hotel {

   public int hotelId;

  public   String hotelLocation;

   public  Menu  menus[];

   public  String branch[];
    public void hotelDetails(){
        System.out.println("Hotel Id: "+this.hotelId);
        System.out.println("Hotel Location: "+this.hotelLocation);
        for(String branches : branch ){
            System.out.println(branches);
        }
        for(Menu menu : menus){
            menu.menuDetails();
        }

    }
}
