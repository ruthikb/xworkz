class Washingmachine{
	static String materialType="Polyvinyl Chloride (PVC)";
	static String colour="White & Grey";
	static String brand="Classic";
	static String weight="6000grams";
	static boolean isWaterresistance = true;
	public static void main(String washing[]){
		
		System.out.println("the type of the material is:" + materialType);
		
		System.out.println("the type of the colour is:" + colour);
		
		System.out.println("the type of the brand is:" + brand);
		
		System.out.println("the weight of the item is:" + weight);
		
		System.out.println("is the item is water resistance:" +isWaterresistance);
		updateWashing();
		
		
	
	
	}
	public static void updateWashing(){
 materialType="Polyvinyl Chloride (PVC)";
	 colour="Black";
	 brand="IFB";
	 weight="5000grams";
	 isWaterresistance = true;
	}

}