package com.xworkz.tinderApp;

import com.xworkz.tinderApp.Constants.Gender;
import com.xworkz.tinderApp.tinder.Tinder;
import com.xworkz.tinderApp.tinderdto.TinderDto;

public class TinderRunner {
    public static void main(String arg[]){

        TinderDto tinderDto = new TinderDto();
        tinderDto.setEmail("teja335@gmail.com");
        tinderDto.setName("tejaswa");
        tinderDto.setPhnNo(5638298643l);
        tinderDto.setGender(Gender.male);

        Tinder flipkart = new Tinder();
        if(flipkart.User(tinderDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }

}
