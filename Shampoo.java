class Shampoo{
	Shampoo(){
	
	System.out.println("the construcor invoked:");
	
	}
	Shampoo(String name, String specialFeature,int price){
		this.name =name;
		this.specialFeature=specialFeature;
		this.price=price;
	
	}
	String name ;
	String specialFeature;
	int price;

}