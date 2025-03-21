class FacebookRunner{
	public static void main(String arg[]){
		String login=Facebook.login("Baba@gmail.com","Baba@123");
		String loginWithPhoneNumber=Facebook.login(1234567898l,"Baba@123");
		System.out.println(login);
		System.out.println(loginWithPhoneNumber);
	}
}