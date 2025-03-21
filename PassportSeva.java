class PassportSeva{
	public static void  getPassport(String cpvLocation,String dcdrLocation, String firstName ,String surName, String dob,String email,String secondEmail,String loginId,String password,String confirmPassword,String hintQuestion ,String hintAnswer,String captcha){
	boolean ref;
	ref=validateUserProfile( cpvLocation, dcdrLocation, firstName , surName,dob, email, secondEmail, loginId, password, confirmPassword, hintQuestion , hintAnswer, captcha);
	if (ref == true){
		System.out.println("Sign up done successfully");
	}
	else{
		System.out.println("Sign up done unsuccessfully");
	}
	}
	public static boolean validateUserProfile(String cpvLocation,String dcdrLocation, String firstName ,String surName, String dob,String email,String secondEmail,String loginId,String password,String confirmPassword,String hintQuestion ,String hintAnswer,String captcha){
	boolean value=false;
	boolean isCpvLocationValid=false;
	boolean isDcdrLocationValid=false;
	boolean isDirstNameValid=false;
	boolean isSurNameValid=false;
	boolean isDobValid=false;
	boolean isEmailValid=false;
	boolean isSecondEmailValid=false;
	boolean isLoginIdValid=false;
	boolean isPasswordValid=false;
	boolean isConfirmPasswordValid=false;
	boolean isHintQuestionValid=false;
	boolean isHintAnswerValid=false;
	boolean isCaptchaValid=false;
	if(cpvLocation!=null && cpvLocation.length()>=3){
		isCpvLocationValid=true;
	}
	else{
		System.out.println("invalid cpvLocation");
	}
	if(dcdrLocation!=null &&!dcdrLocation.isEmpty()){
		isDcdrLocationValid=true;
	}
	else{
		System.out.println("invalid DcdrLocation");
	}
	if(firstName!=null && firstName.length()>=3){
		isFirstNameValid=true;
	}
	else{
		System.out.println("invalid FirstName");
	}
	if(surName!=null && surName.length()>=3){
		isSurNameValid=true;
	}
	else{
		System.out.println("invalid SurName");
	}
	if(dob!=null && !dob.isEmpty()){
		isDobValid=true;
	}
	else{
		System.out.println("invalid Dob");
	}
	if(email!=null){
		isEmailValid=true;
	}
	else{
		System.out.println("invalid Email");
	}
	if(scondEmail!=null){
		isSecondEmailValid=true;
	}
	else{
		System.out.println("invalid SecondEmail");
	}
	if(loginId!=null){
		IsLoginIdValid=true;
	}
	else{
		System.out.println("invalid LoginId");
	}
	if(Password!=null){
		isPasswordValid=true;
	}
	else{
		System.out.println("invalid Password");
	}
	if(confirmPassword!=null && confirmPassword==Password){
		isConfirmPasswordValid=true;
	}
	else{
		System.out.println("password not matching");
	}
	if(hintQuestion!=null){
		isHintQuestionValid=true;
	}
	else{
		System.out.println("HintQuestion not found");
	}
	if(hintAnswer!=null){
		isHintAnswerValid=true;
	}
	else{
		System.out.println("HintAnswer not found");
	}
	if(captcha!=null){
		isCaptchaValid=true;
	}
	else{
		System.out.println("Captcha not found");
	}
	if(isCpvLocationValid==true && isDcdrLocationValid==true && isFirstNameValid==true && isSurNameValid==true && isDobValid==true && isEmailValid==true && isSecondEmailValid==true && I=isLoginIdValid==true && isPasswordValid==true && isConfirmPasswordValid==true && isHintQuestionValid==true && isHintAnswerValid==true && isCaptchaValid==true){
		value=true;
	}
	return value;
	
		
	}


}