package com.xworkz.airbnbApp;

import com.xworkz.airbnbApp.Constants.Payment;
import com.xworkz.airbnbApp.airbnb.Airbnb;
import com.xworkz.airbnbApp.airbnbdto.AirbnbDto;



public class AirbnbRunner {
    public static void main(String arg[]){

        AirbnbDto airbnbDto = new AirbnbDto();
        airbnbDto.setEmail("ANKITH335@GMAIL.COM");
        airbnbDto.setName("anikth");
        airbnbDto.setPhnNo(5638298643l);
        airbnbDto.setPaymentType(Payment.online);
        airbnbDto.setTravelType(Preferences.bus);

        Airbnb airbnb = new Airbnb();
        if(airbnb.User(airbnbDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
