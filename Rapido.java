class Rapido{
	public static String signin(String username,String Password){
		String message =null;
	if (username.length() >= 4 && username != null) {
            message = "User Found";
        } else
            message = "User not Found";
        return message;

    }
	public static String signin1(String email,String password){
		String message =null;
	if(email!=null && email.length()>=4){
		message ="User Found";
	}else
		message ="User Not Found";
	return message;
	}
	
	}
