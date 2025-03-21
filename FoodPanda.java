class FoodPanda{
	public static int food(String list){
	int cost=0;
	if (list== "Prawn ghee roast") {  
            cost = 459;
            return cost;
        } 
		else{
			System.out.println("list not found:");
		}
		return cost;
	
	}
	public static int food(String list,int quantity){
	int cost=0;
	if(list == "Prawn ghee roast"){
		cost=459*quantity;
		return cost;
	}
	else{
		System.out.println("list not found:");
	}
	return cost;
}
}