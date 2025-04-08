package com.xworkz.maxapp;

import com.xworkz.maxapp.generatedata.MaxDto;
import com.xworkz.maxapp.max.Max;

public class MaxRunner {

        public static void main(String arg[]) {
            MaxDto maxDto = new MaxDto();
            maxDto.setFullName("Kushal");
            maxDto.setEmailAddress("kushal345@gmail.com");
            maxDto.setPassword("kushal4553");
            maxDto.setConfirmPassword("kushal4553");

            MaxDto maxDto1 = new MaxDto();
           maxDto1.user(maxDto);
        }
    }
