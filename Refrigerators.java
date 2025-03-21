class Refrigerators{
	static String brand="Whirlpool";
	static String capacity="184 litres";
	static String doorType="double door";
	public static void main(String refrigerators[]){
		
		System.out.println("the brand of the refrigerators is:" + brand);
		
		System.out.println("the capacity of the refrigerators is:" + capacity);
		
		System.out.println("the door type is:" + doorType);
		updateRefrigerators();
		System.out.println("the brand of the refrigerators is:" + brand);
		
		System.out.println("the capacity of the refrigerators is:" + capacity);
		
		System.out.println("the door type is:" + doorType);
		
	
	}
	public static void updateRefrigerators(){
		 brand="LG";
	 capacity="199 litres";
	 doorType="Triple door";
	}
	
	


}