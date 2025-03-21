class AmazonRunner{
	public static void main(String arg[]){
	System.out.println("Amzon constructor got invoked");
	//className references=copy of the class and alocate the memory in the heap
	Amazon ref=new Amazon();
	ref.id=1;
	ref.yourName="Baba";
	ref.phoneNumber=1234567895;
	ref.password="baba@123";
	System.out.println("the account id is:"+ref.id);
	System.out.println("the account username is: "+ref.yourName);
	System.out.println("the account user number is: "+ref.phoneNumber);
	System.out.println("the account password is: "+ref.password);
	System.out.println("the amazon user details are: " +ref.id +" "+ref.yourName +" "+ref.phoneNumber +" " +ref.password);
	}

}