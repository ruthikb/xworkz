class UberEats {
    public static int rate(String product){
        int price=0;
        if(product=="Peri Peri Chicken Wings"){
            price=299;
            return price;
        }
		else{
			System.out.println("product not found");
		}
		return price;
		}
		public static int rate(String product,int Quantity){
		int price=0;
		if(product=="peri peri Chicken Wings"){
			price=299*Quantity;
			return price;
		}
		else{
			System.out.println("product not found");
		}
		return price;
	}
}