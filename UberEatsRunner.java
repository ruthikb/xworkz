class UberEatsRunner{
	public static void main(String args[]){
	int price=UberEats.rate("Peri Peri Chicken Wings");
	int priceWithQuantity=UberEats.rate("Peri Peri Chicken Wings",9);
	System.out.println(price);
	System.out.println(priceWithQuantity);
	}

}