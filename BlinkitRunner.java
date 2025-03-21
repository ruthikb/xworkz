class BlinkitRunner{
	public static void main(String arg[]){
	double price=Blinkit.getFoodPrice("Vegetable Samosa");
	double priceWithQuantity=Blinkit.getFoodPrice("Vegetable Samosa",8);
	System.out.println(price);
	System.out.println(priceWithQuantity);
	}

}