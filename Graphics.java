class Graphics{
	static String coProcessor="GT730";
	static String brand="Zebronics";
	static String ramSize="4GB";
	static String clockSpeed="1333 MHz";
	static String outputInterface="VGA, DVI, HDMI";
	public static void main(String graphic[]){
		
		System.out.println("the coProcessor used is :" +coProcessor);
		
		System.out.println("the name of the brand is:" +brand);
		
		System.out.println("the six eof the ran is "+ ramSize);
		
		System.out.println("the cockspeed is" +clockSpeed);
		
		System.out.println("the outputInterface used is" +outputInterface);
		
		updateGraphics();
		System.out.println("the coProcessor used is :" +coProcessor);
		
		System.out.println("the name of the brand is:" +brand);
		
		System.out.println("the six eof the ran is "+ ramSize);
		
		System.out.println("the cockspeed is" +clockSpeed);
		
		System.out.println("the outputInterface used is" +outputInterface);
		
	}
	public static void updateGraphics(){
	 coProcessor="GT530";
	 brand="AMB";
	 ramSize="5GB";
	 clockSpeed="133 MHz";
	 outputInterface="VGA, HDMI";
	}


}