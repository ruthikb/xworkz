class ZomatoRunner{
	public static void main(String order[]){
	int cost=Zomato.price("Panner Butter masala");
	int costWithQuantity=Zomato.price("Panner Butter masala",7);
	System.out.println(cost);
	System.out.println(costWithQuantity);
	}

}