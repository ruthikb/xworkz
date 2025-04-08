package com.xworkz.meeshoApp;

import com.xworkz.meeshoApp.meesho.MeeshoDto;

public class MeeshoRunner {
    public static  void  main(String arg[]) {
        MeeshoDto ref=new MeeshoDto();
        ref.setfullName("baba");
        ref.setemail("baba123@gmail.com");
        ref.setphoneNo("123446788");
        ref.setotp(7592);
        ref.displayDetails();
        MeeshoDto ref1=new MeeshoDto();
        ref1.registerUser(ref);
    }
    }
}
