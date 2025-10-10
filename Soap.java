class Soap{
	Soap(){
		System.out.println("the constructor invoked:");
	
	}
	Soap(String brand ,int price,String scent){
	
		this.brand=brand;
		this.price=price;
		this.scent=scent;
	
	}
	String brand;
	int price;
	String scent;

}