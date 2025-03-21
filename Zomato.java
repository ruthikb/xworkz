class Zomato{
	public static int price(String productName){
	int cost= 0;
	if(productName == "Panner Butter masala"){
		cost=299;
		return cost;
	}
	else
		System.out.println("the productName not found:");
		return cost;
	}
	public static int price(String productName,int quantity){
	int cost=0;
	if(productName ==  "Panner Butter masala"){
		cost=299*quantity;
		return cost;
	}
	else{
		System.out.println("the productName not found:");
	}
	return cost;
	}

}