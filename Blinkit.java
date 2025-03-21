class Blinkit {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Vegetable Samosa") {
            price = 49.99;
			return price;
        } 
		else{
			System.out.println("foodName not found");
		}
		return price;
		}
		public static double getFoodPrice(String foodName,double quantity){
			double price=0.0;
			if(foodName == "Vegetable Samosa"){
				price =49.99*quantity;
				return price;
			}
			else{
				System.out.println("foodName not found");
		}
		return price;
		}
}