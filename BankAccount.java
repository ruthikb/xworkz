class BankAccount{
	//varieble /field/data member/property/reference
	static double balance;
	//behaviour/functionality/purpose//parameter : Datatype ref
	public static void credit(double ammount){
	System.out.println("startof credit():");
	if(ammount>=balance){
		balance=balance+ammount;
		System.out.println("the credit ammount is:"+balance);
	}
	else
		System.out.println("invalid ammount:");
	System.out.println("credit ended");
	} 
	public static void debit(double ammount){
	System.out.println("start of debit():");
	if(ammount<=balance){
		balance=balance-ammount;
		System.out.println("the debit amount is:"+balance);
	}
	else
		System.out.println("invalid ammount");
	System.out.println("end of debit():");
	}
	public static void getBalance(){
	System.out.println("the balance of the ammount is:"+balance);
	}
}