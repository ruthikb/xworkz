package com.xworkz.meeshoApp.meesho;

import java.sql.SQLOutput;

public class MeeshoDto {
    public  static  MeeshoDto meeshoDto;
    private String fullName;
    private String email;
    private  String phoneNo;
    private  int otp;

    public  void setfullName(String fullName ){
        this.fullName=fullName;
    }
    public  String getFullName(){
        return  fullName;
    }
    public  void setemail(String email){
        this.email=email;
    }
    public  String getemail(){
        return email;
    }
    public  void setphoneNo(String phoneNo){
        this.phoneNo=phoneNo;
    }
    public  String getphoneNo(){
        return  phoneNo;
    }
    public  void setotp(int otp){
        this.otp=otp;
    }
    public  int getOtp(){
        return otp;
    }
    public  void displayDetails(){
        System.out.println("fullName"+fullName);
        System.out.println("email:"+email);
        System.out.println("phoneNo"+phoneNo);
        System.out.println("otp"+otp);
    }

}
