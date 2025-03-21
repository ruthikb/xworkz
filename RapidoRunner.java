class RapidoRunner{
	public static void main(String arg[]){
		String signin=Rapido.signin("Baba","Baba@123");
		String signinWithEmail=Rapido.signin1("Baba@gmail.com","Baba@123");
		System.out.println(signin);
		System.out.println(signinWithEmail);
	
	}

}