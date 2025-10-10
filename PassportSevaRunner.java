package com.xworkz.passportseva;

import com.xworkz.passportseva.constants.CpvLocation;
import com.xworkz.passportseva.constants.DcdrLocation;
import com.xworkz.passportseva.generatepassport.PassportSeva;
import com.xworkz.passportseva.passport.PassportDto;

public class PassportSevaRunner {

    public static void main(String[] args) {

        PassportDto passportDto = new PassportDto();
        passportDto.setCpvLocation(CpvLocation.PassportOffice);
        passportDto.setDcdrLocation(DcdrLocation.Bengaluru);
        passportDto.setGivenName("");
        passportDto.setSurName("kruthik");
        passportDto.setDob("03-07-2003");
        passportDto.setEmail("kruthik0906@gmail.com");
        passportDto.setEmailLoginSame(true);
        passportDto.setLoginId("kruthik0906@gmail.com");
        passportDto.setPwd("kruthik#1987");
        passportDto.setConfirmPwd("kruthik#1987");
        passportDto.setHintQues("What is Nick Name?");
        passportDto.setHintAns("Chothu");
        passportDto.setCaptcha("AGB25");
        passportDto.displayDetails();

        PassportSeva passportSeva = new PassportSeva();
        passportSeva.registerUser(passportDto);
        
    }
}
