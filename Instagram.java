class Instagram{
	public static void getsignUp(String FullName,String EmailId,String Password, String UserName){
	boolean value;
	value=validateUser(FullName,EmailId,Password,UserName);
	if(value==true){
	System.out.println("signUp Sucessfull");
	}
	else{
	System.out.println("signUp Failed");
	}
	public static boolean validateUser(String FullName,String EmailId,String Password,String UserName){
	boolean ref=false;
		boolean isFullNameValid=false;
		boolean isEmailIdValid=false;
		boolean isPasswordValid=false;
		boolean isUserNmaeValid=false;
		if(FullName!=null && FullName.length()>=3){
	
		isFullNameValid=true;
	
	}
	else{
		System.out.println("fullName is invalid. please provide valid fullNameName ");
	}
	if(EmailId!=null){
		isEmailIdValid=true;
	}
	else{
	System.out.println("EmailId is invalid. please provide valid EmailId");
	}
	if(Password!=null){
	isPasswordValid=true;
	}
	else{
	System.out.println("password is invalid. please provide valid password");
	}
	if(UserName!=null){
	isuserNmaeValid=true;
	}
	else{
	System.out.println("UserName is invalid. please provide valid UserName ");
	}
	if(isFullNameValid==true && isEmailIdValid==true && isPasswordValid==true && isuserNmaeValid==true ){
		ref =true;
	}
	return ref;
	}
	}


}