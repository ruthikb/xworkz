class Electrickettle {
	static String brand = "Hamilton Beach";
	static String model = "Glass Electric Kettle";
	static int capacity = 1;
	static boolean hasAutoShutOff = true;
	static int power = 1500;
	static int price = 1999;
	static String color = "Clear Glass";
    public static void main(String kettle[]) {
        
		System.out.println("Brand: " + brand);
        
		System.out.println("Model: " + model);
         
		System.out.println("Capacity: " + capacity + " L");
        
		System.out.println("Auto Shut-Off: " + hasAutoShutOff);
         
		System.out.println("Power: " + power + " W");
        
		System.out.println("Price: Rs" + price);
        
		System.out.println("Color: " + color);
		updateElectrickettle();
		System.out.println("Brand: " + brand);
        
		System.out.println("Model: " + model);
         
		System.out.println("Capacity: " + capacity + " L");
        
		System.out.println("Auto Shut-Off: " + hasAutoShutOff);
         
		System.out.println("Power: " + power + " W");
        
		System.out.println("Price: Rs" + price);
        
		System.out.println("Color: " + color);
		
             
        
    }
	public static void updateElectrickettle(){
	 brand ="butterfly";
	 model ="black Electric Kettle";
	 capacity =2;
	 hasAutoShutOff =true;
	  power = 1400;
	 price = 999;
	 String color = "black Glass";
	}
	
}