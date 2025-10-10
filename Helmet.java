class Helmet{
	static String color="black/grey";
	static String brand="Axor";
	static String weight="1500 Grams";
	static String material="Acrylonitrile Butadiene Styrene (ABS)";
	public static void main(String helmet[]){
		
		System.out.println("the color of the helmet is:" +color);
		
		System.out.println("the brand of the helmet is:" +brand);
		
		System.out.println("the weight of the helmet is:" +weight);
		
		System.out.println("the material used in the helmet is:" +material);
		updateHelmet();
		System.out.println("the color of the helmet is:" +color);
		
		System.out.println("the brand of the helmet is:" +brand);
		
		System.out.println("the weight of the helmet is:" +weight);
		
		System.out.println("the material used in the helmet is:" +material);
	
	
	
	}
	public static void updateHelmet(){
	 color="black";
	 brand="vegas";
	 weight="2500 Grams";
	 material="Acrylonitrile Butadiene Styrene (ABS)";
		
	}


}