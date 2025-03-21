class Mouse{
	static String brand ="Offbeat";
	static String colour ="black";
	static String connectivityTechnology="Bluetooth";
	static String specialFeature="Wireless Soundless Rechargeable";
	public static void main(String mouse[]){
		
		System.out.println("the brand of mouse is:" +brand);
		
		System.out.println("the color of the mouse is:" +colour);
		
		System.out.println("the connectivity is:" +connectivityTechnology);
		
		System.out.println("the feature of the mouse is:" +specialFeature);
		updateMouse();
		System.out.println("the brand of mouse is:" +brand);
		
		System.out.println("the color of the mouse is:" +colour);
		
		System.out.println("the connectivity is:" +connectivityTechnology);
		
		System.out.println("the feature of the mouse is:" +specialFeature);
		
	}
	public static void updateMouse(){
	 brand ="Apple";
	 colour ="White";
	 connectivityTechnology="Bluetooth";
	 specialFeature="Wireless Soundless";	
	}
}