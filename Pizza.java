class Pizza{
	static int pizzaId=1;
	static String pizzaName="Margaritha";
	static String pizzaSize="regular";
	static String pizzaType="veg";
	static int pizzaPrice=349;
	public static void main(String pizza[]){
		
		System.out.println("the id of the pizza is:" +pizzaId);
		
		System.out.println("the name of the pizza is:" +pizzaName);
		
		System.out.println("the size of the pizza is:" +pizzaSize);
		
		System.out.println("the type of pizza is:" +pizzaType);
		
		System.out.println("the price of pizza is:" +pizzaPrice);
		updatePizza();
		System.out.println("the id of the pizza is:" +pizzaId);
		
		System.out.println("the name of the pizza is:" +pizzaName);
		
		System.out.println("the size of the pizza is:" +pizzaSize);
		
		System.out.println("the type of pizza is:" +pizzaType);
		
		System.out.println("the price of pizza is:" +pizzaPrice);
	}
		public static void updatePizza(){
		 pizzaId=23;
	 pizzaName="DoubleCheeseMargaritha";
	 pizzaSize="Medium";
	 pizzaType="veg";
	 pizzaPrice=449;
			
		}
	
}