package com.xworkz.hotel;

import com.xworkz.hotel.hotel.Hotel;
import com.xworkz.hotel.menu.Menu;

import java.util.Arrays;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("System of main");
        //default values
        String branches[]={"vvpuram","kormangala","peenya"};
        String ingerdientsOfCoffee[]={"milk","sugar","coffee powder"};
        String ingerdientsOfTea[]={"milk","water","teapowder","ginger"};

        Menu menus[]=new  Menu[2];
        //copy of constructor/
       Menu menus1=new Menu();
       menus1.menuId=1;
       menus1.menuName="coffee";
       menus1.menuPrice=15.00;
       menus1.ingerdients=ingerdientsOfCoffee;

       Menu menus2=new Menu();
       menus2.menuId=2;
       menus2.menuName="tea";
       menus2.menuPrice=10.00;
       menus2.ingerdients=ingerdientsOfTea;

        menus[0]=menus1;
        menus[1]=menus2;

        menus1.menuDetails();
        menus2.menuDetails();


        Hotel ref=new Hotel();
        ref.hotelId=1;
        ref.hotelLocation="KR Puram";
        ref.branch=branches;
        ref.menus=menus;
        ref.hotelDetails();
        System.out.println("end of main:");


    }
}
