class Mixer{
	static boolean isConnected=false;
	static int currentSpeed;
	static int maxSpeed=3;
	static int minSpeed;
	public static void isConnected(){
		if(isConnected==false){
			isConnected=true;
			System.out.println("Mixer is on");
		}
		else{
			isConnected=false;
			System.out.println("Mixer is off");
		}
	
	}
	public static int increaseSpeed(){
		if(isConnected==true && currentSpeed<maxSpeed){
			currentSpeed=currentSpeed+1;
			System.out.println("increaseSpeed by one:"+currentSpeed);
		}
		else{
			System.out.println("speed has reached max:");
		}
		return currentSpeed;
	}
	public static int decreaseSpeed(){
		if(isConnected==true && currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("decreaseSpeed by one:"+currentSpeed);
		}
		else{
			System.out.println("speed has reached min:");
		}
		return currentSpeed;
	}

}