class Fridge{
	static int currentTemp;
	static int maxTemp=5;
	static int minTemp;
	static boolean isConnected=false;
	public static void isConnected(){
		if(isConnected==false){
			isConnected=true;
			System.out.println("Fridge is on:");
		}
		else{
			isConnected=false;
			System.out.println("Fridge is off");
		}
	
	}
	public static int increaseTemp(){
		if(isConnected==true && currentTemp<maxTemp){
			currentTemp=currentTemp+1;
			System.out.println("increaseTemp by one:"+currentTemp);
		}
		else{
			System.out.println("MaxTemp has been reached");
	}
	return currentTemp;


	}
	public static int decreaseTemp(){
		if(isConnected==true && currentTemp>minTemp){
			currentTemp=currentTemp-1;
			System.out.println("decreaseTemp by one:"+currentTemp);
		}
		else{
			System.out.println("minTemp has been reached");
		}
		return currentTemp;
	}
}
