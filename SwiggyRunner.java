class SwiggyRunner{
	public static void main(String arg[]){
	double cost=Swiggy.foodPrice("Aloo Jeera");
	double costWithQuatity=Swiggy.foodPrice("Aloo Jeera",9);
	System.out.println(cost);
	System.out.println(costWithQuatity);
	}

}