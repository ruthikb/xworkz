class Zepto{
	public static int cafe(String name){
	int price=0;
	if(name == "Vietnamese Cold Coffee"){
		price=239;
		return price;
	}
	
	else{
		System.out.println("Name is not found");
	}
	return price;
	}
	public static int cafe(String name,int quantity){
	int price=0;
	if(name == "Vietnamese Cold Coffee"){
		price=239*quantity;
		return price;
	}
	else{
		System.out.println("name is not found");
	}
	return price;
	}
	

}