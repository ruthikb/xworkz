class Noodles{
	Noodles(){
	System.out.println("the constructor got invoked:");
	}
	Noodles(String brand,int noOfPacket, int quantity){
		this.brand=brand;
		this.noOfPacket=noOfPacket;
		this.quantity=quantity;
	
	}
	String brand;
	int noOfPacket;
	int quantity;
}