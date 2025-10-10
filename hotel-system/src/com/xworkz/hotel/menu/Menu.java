package com.xworkz.hotel.menu;

public class Menu {
   public int menuId;

   public String menuName;

   public double menuPrice;

    public String ingerdients[];

    public void menuDetails(){
        System.out.println("Item Id: "+this.menuId);
        System.out.println("Item Name: "+this.menuName);
        for(String ingridient : ingerdients){
            System.out.println(ingridient);
        }
        System.out.println("Item Price: Rs."+this.menuPrice);
    }

}
