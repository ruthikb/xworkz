package com.xworkz.flipcartapp.flipcart;
import  com.xworkz.flipcartapp.generatedata.FlipcartDto;
public class Flipcart {
    public boolean User(FlipcartDto flipkartDto) {
        boolean isUserRegistered = false;
        boolean userValid = validateUser(flipkartDto);

        if (userValid) {
            isUserRegistered = true;
        } else {
            System.out.println("Not registered");
        }

        return isUserRegistered;
    }

    public boolean validateUser(FlipcartDto flipkartDto) {
        boolean isUserValidated = false;

        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;

        if (flipkartDto.getEmail() != null) {
            isEmail = true;
        }

        // Similarly, you can validate name, phone number, and payment info
        // Example:
        if (flipkartDto.getName() != null) {
            isName = true;
        }

        if (flipkartDto.getPhnNo() > 0) {
            isPhnNo = true;
        }
        return isUserValidated;
    }
}
