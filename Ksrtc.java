class Ksrtc{
	public static void UserInfo(String EmailID,String FullName, String PhoneNumber,String Password,String ReConfirmPassword){
	boolean ref;
	ref=UserProfile(EmailID,FullName,PhoneNumber,Password,ReConfirmPassword);
	if(ref==true){
		System.out.println("signup Sucessfull");
	}
	else{
		System.out.println("Signup unsucessful");
	}
	}
	public static void UserProfile(String EmailID,String FullName,String PhoneNumber,String Password,String ReConfirmPassword){
	boolean value=false;
	boolean IsEmailIdValid=false;
	boolean IsFullNameValid=false;
	boolean IsPhoneNumberValid=false;
	boolean IsPasswordValid=false;
	boolean IsReConfirmPasswordValid=false;
	if(EmailID!=null){
		IsEmailIdValid=true;
	}
	else{
		System.out.println("invalid emailid");
	}
	if(FullName!=null){
		IsFullNameValid=true;
		}
	else{
			System.out.println("invalid FullName");
	}
	if(PhoneNumber!=null && PhoneNumber.length()==10){
		IsPhoneNumberValid=true;
	}
	else{
		System.out.println("invalid PhoneNumber");
	}
	if(Password!=null){
		IsPasswordValid=true;
	}
	else{
		System.out.println("invalid Password");
	}
	if(ReConfirmPassword!=null && ReConfirmPassword==Password ){
		IsReConfirmPasswordValid=true;
	}
	else{
		System.out.println("password not matching");
	}
	if(IsEmailIdValid==true && IsFullNameValid==true && IsPhoneNumberValid==true &&IsPasswordValid==true && IsReConfirmPasswordValid==true){
		value=true;
	}
	return value;
	
	}

}