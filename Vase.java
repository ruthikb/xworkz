class Vase{
	Vase(){
		System.out.println("the constructor got invoked");
	
	}
	Vase(String shape, String brand,int price){
	
		this.shape=shape;
		this.brand=brand;
		this.price=price;
	}
	String shape;
	String brand;
	int price;

}