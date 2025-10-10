class Watch{
	static int watchId=1;
	static String watchBrand="G-shock";
	static String watchColor="Silver";
	static String watchType="SmartWatch";
	static String watchShape="Square";
	static boolean isWaterProof = true;
	public static void main(String watch[]){
		
		System.out.println("the id of the watch is:" +watchId);
		
		System.out.println("the brand of the watch is:" +watchBrand);
		
		System.out.println("the color of the watch is:" +watchColor);
		
		System.out.println("the type of the watch is:" +watchType);
		
		System.out.println("the shape of the watch is:" +watchShape);
		
		System.out.println("is the watch is waterproof is:" +isWaterProof);
		
		updatewatch();
		System.out.println("the id of the watch is:" +watchId);
		
		System.out.println("the brand of the watch is:" +watchBrand);
		
		System.out.println("the color of the watch is:" +watchColor);
		
		System.out.println("the type of the watch is:" +watchType);
		
		System.out.println("the shape of the watch is:" +watchShape);
		
		System.out.println("is the watch is waterproof is:" +isWaterProof);
		
	
	}
	public static void updatewatch(){
	 watchId=123;
	 watchBrand="Rolex";
	 watchColor="Gold";
	 watchType="Digital watch";
	 watchShape="circle";
	 isWaterProof = true;
	}

}