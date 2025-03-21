class BankAccountRunner{
	public static void main(String acc[]){
		System.out.println("main Started():");
		BankAccount.getBalance();
		BankAccount.credit(1000.00);
		BankAccount.getBalance();
		BankAccount.debit(500.00);
		BankAccount.getBalance();
		System.out.println("end of main():");
	}
}