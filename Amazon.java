class Amazon{
	public static void getsignUp(String fullName,String phoneNumber,String Dob,String emailID,String gender){
	boolean reg;
	reg= validateUserProfile(fullName,phoneNumber,Dob,emailID,gender);
	if (reg == true){
		System.out.println("Sign up done successfully");
	}
	else{
		System.out.println("Sign up done unsuccessfully");
	}
	}
	public static boolean validateUserProfile(String fullName,String phoneNumber,String dob,String emailId,String gender){
		boolean value=false;
		boolean isFullNameValid=false;
		boolean isPhoneNumberValid=false;
		boolean isDobValid=false;
		boolean isEmailIdValid=false;
		boolean isGenderValid=false;
	
	if(fullName!=null && fullName.length()>=3){
	
		isFullNameValid=true;
	
	}
	else{
		System.out.println("fullName is invalid. please provide valid fullNameName ");
	}
	if(phoneNumber!=null && phoneNumber.length()>0 && phoneNumber.length()==10){
		isPhoneNumberValid=true;
		
	}
	else{
		System.out.println("phoneNumber is invalid.please provide valid phoneNumber");
	
	}
	if(dob!=null){
		isDobValid=true;
	}
	else{
		System.out.println("dob is invalid.please provide valid dob");
	
	}
	if(emailId!=null){
		isEmailIdValid=true;
	}
	else{
		System.out.println("emailId is invalid. please provide valid emailId");
	}
	if(gender!=null){
		isGenderValid=true;	
	}
	else{
		System.out.println("gender is invalid. please provide valid gender");
	}
	if(isFullNameValid==true && isPhoneNumberValid==true && isDobValid==true && isEmailIdValid==true && isGenderValid==true ){
		value =true;
	}
	return value;
	}

}