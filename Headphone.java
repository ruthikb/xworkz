class Headphone{
	static String brand="noise";
	static String color="calm beige";
	static String earPlacement="on ear";
	static String noiseControl="Hybrid Noise Cancellation";
	public static void main(String headphone[]){
		
		System.out.println("the brand of the headphone is:"+ brand);
		
		System.out.println("the color of the headphone is:"+ color);
		
		System.out.println("the earPlacement of the headphone is:" +earPlacement);
		
		System.out.println("the noise control of the headphone is:"+ noiseControl);
		updateHeadphone();
		System.out.println("the brand of the headphone is:"+ brand);
		
		System.out.println("the color of the headphone is:"+ color);
		
		System.out.println("the earPlacement of the headphone is:" +earPlacement);
		
		System.out.println("the noise control of the headphone is:"+ noiseControl);
	
	}
	public static void updateHeadphone(){
	 brand="boat";
	 color="black";
	 earPlacement="over the head";
	 noiseControl=" Noise Cancellation";	
	}


}