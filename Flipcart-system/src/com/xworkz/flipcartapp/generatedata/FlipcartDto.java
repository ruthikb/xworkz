package com.xworkz.flipcartapp.generatedata;

public class FlipcartDto {
    private String name;
    private String email;
    private long phnNo;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhnNo(long phnNo){
        this.phnNo=phnNo;
    }
    public  long getPhnNo(){
        return  phnNo;
    }
}
