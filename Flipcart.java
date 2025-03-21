class Flipcart{
	public static void getRegister(String firstName,String lastName,String phoneNumber,String Dob,String emailID,String gender){
	boolean ref;
	ref = validateUserProfile(firstName,lastName,phoneNumber,Dob,emailID,gender);
	if (ref == true){
		System.out.println("Sign up done successfully");
	}
	else{
		System.out.println("Sign up done unsuccessfully");
	}
	}
	public static boolean validateUserProfile(String firstName,String lastName,String phoneNumber,String dob,String emailId,String gender){
		boolean value=false;
		boolean isFirstNameValid=false;
		boolean isLastNameValid=false;
		boolean isPhoneNumberValid=false;
		boolean isDobValid=false;
		boolean isEmailIdValid=false;
		boolean isGenderValid=false;
	
	if(firstName!=null && firstName.length()>=3){
	
		isFirstNameValid=true;
	
	}
	else{
		System.out.println("firstName is invalid. please provide valid firstName ");
	}
	if(lastName!= null && lastName.length()>=3){
		
		isLastNameValid =true;
	}
	else{
		System.out.println("lastname is invalid.please provide valid lastName");
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
	if(isFirstNameValid==true && isLastNameValid==true && isPhoneNumberValid==true && isDobValid==true && isEmailIdValid==true && isGenderValid==true ){
		value =true;
	}
	return value;
	}

}