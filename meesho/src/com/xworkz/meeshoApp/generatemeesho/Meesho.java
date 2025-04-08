package com.xworkz.meeshoApp.generatemeesho;

import com.xworkz.meeshoApp.meesho.MeeshoDto;

public class Meesho {
public  boolean registerUser(MeeshoDto ref){
    boolean isUserRegistered=false;
    boolean userValidated=validateUser(ref);
    if(userValidated==true){
        isUserRegistered=true;
    }else {
        System.out.println("user not registered");
        return  isUserRegistered;
    }
    return isUserRegistered;
}
public  boolean validateUser(MeeshoDto ref){
    boolean isUserValidated=false;
    boolean isfullNameValid=false;
    boolean isemailValid=false;
    boolean isphoneNoValid=false;
    boolean isotpValid=false;
    if(ref.getFullName()!=null && !ref.getFullName().isEmpty()){
        isfullNameValid=true;
    }else {
        System.out.println("name is not valid!");
        return isfullNameValid;
    }
    if (ref.getemail()!=null && !ref.getemail().isEmpty()) {
        isemailValid = true;
    }else {
        System.out.println("email is invalid");
        return  isemailValid;
    }
    if (ref.getphoneNo()!=null && ref.getphoneNo().length()=10){
        isphoneNoValid=true;
    }else {
        System.out.println("invalid phoneno");
        return  isphoneNoValid;
    }
    if(ref.getOtp()!=null){
        isotpValid=true;
    }else {
        System.out.println("invalid otp");
        return  isotpValid;
    }
    return isUserValidated;
}

