class MicroWave{
	static int currentTemp;
	static int maxTemp=10;
	static int minTemp;
	static boolean isConnected=false;
	 public static void isConnected(){
		if(isConnected==false){
			isConnected=true;
			System.out.println("Projector is on:");
		}
		else{
			isConnected=false;
			System.out.println("Projector is off:");
		}
	}
	public static int increaseTemp(){
		if(isConnected==false && currentTemp<maxVolume ){
			currentTemp=currentTemp+1;
			System.out.println("increaseTemp by one:"+currentTemp);
		}
		else{
			System.out.println("Maximum Temp has been reached");
		}
		return currentTemp;
	
	}
	public static int decreaseTemp(){
		if(isConnected==false && currentTemp>minTemp){
			currentTemp=currentTemp-1;
			System.out.println("decreaseTemp by one :"+currentTemp);
		}
		else{
			System.out.println("minimum Temp has been reached");
		}
		return currentTemp;
	
	}
	 
}