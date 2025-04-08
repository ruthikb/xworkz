package com.xworkz.flipcartapp;
import com.xworkz.flipcartapp.generatedata.FlipcartDto;
import com.xworkz.flipcartapp.flipcart.Flipcart;
public class FlipcartRunner {
    public static void main(String arg[]) {
        FlipcartDto flipkartDto = new FlipcartDto();
        flipkartDto.setEmail("baba335@gmai.com");
        flipkartDto.setName("baba Singh");
        flipkartDto.setPhnNo(56382986431L);

        Flipcart flipkart = new Flipcart();
        if (flipkart.User(flipkartDto)) {
            System.out.println("successful");
        } else {
            System.out.println("unsuccessful");
        }
    }
}
