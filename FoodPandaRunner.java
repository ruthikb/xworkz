class FoodPandaRunner{
	public static void main(String arg[]){
	int cost=FoodPanda.food("Prawn ghee roast");
	int costWithQuantiy=FoodPanda.food("Prawn ghee roast",8);
	System.out.println(cost);
	System.out.println(costWithQuantiy);
	}

}