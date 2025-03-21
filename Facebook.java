class Facebook{
	public static String login(String email,String Password){
		String meg=null;
		if(email!=null&&email.length()>=4){
			meg="UserFound";
		}
		else{
			meg="user not found";
			return meg;
			}
			return meg;
	}
	public static String login(long phoneNo,String password){
		String meg=null;
		if(phoneNo>=10){
			meg="Phone Number Correct";
		}
		else{
			meg="phoneNo not valid";
			return meg;
		}
		return meg;
	}
}