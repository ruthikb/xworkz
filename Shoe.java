class Shoe{
	static String materialType="Thermoplastic Elastomers, Rubber, Suede"	;
	static String closureType="Lace-Up";
	static String heelType="flat";
	static String soleMaterial="rubber";
	static String style="sneaker";
	public static void main(String shoe[]){
	
	System.out.println("the materialType of the shoe is:" +materialType);
	
	System.out.println("the closureType of the shoe is:" +closureType);
	
	System.out.println("the heelType of the shoe is:" +heelType);
	
	System.out.println("the soleMaterial of the shoe is:" +soleMaterial);
	
	System.out.println("the style of the shoe is:" +style);
	updateShoe();
	System.out.println("the materialType of the shoe is:" +materialType);
	
	System.out.println("the closureType of the shoe is:" +closureType);
	
	System.out.println("the heelType of the shoe is:" +heelType);
	
	System.out.println("the soleMaterial of the shoe is:" +soleMaterial);
	
	System.out.println("the style of the shoe is:" +style);
	
	
	}
	public static void updateShoe(){
		 materialType="Thermoplastic Elastomers, Rubber,"	;
	 closureType="NO Lace-Up";
	 heelType="flat";
	 soleMaterial="Leather";
	 style="Boots";
		
	}

}