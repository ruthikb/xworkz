class CarryBag{
	CarryBag(){
		System.out.println("the constructor got invoked");
	
	}
	CarryBag(String type, String brand ,int price){
		this.type=type;
		this.brand=brand;
		this.price=price;
	
	}
	String type;
	String brand;
	int price;

}