class Ac{
	static boolean acIsOn=false;
	static int currentTemperature;
	static int maxTemperature=6;
	static int minTemperature;
	public static void onOrOff(){
		
		if(acIsOn==false){
			acIsOn=true;
			System.out.println("Ac is turn on");
		
		}
		else{
			acIsOn=false;
			System.out.println ("Ac is turn off");
		}
	
	}
	public static int increaseTemp(){
		if(acIsOn==true && currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("increaseTemp by one:"+currentTemperature);
		}
		else{
			System.out.println("Maximum temp has been reached");
		}
		return currentTemperature;
		
		
	}
	public static int decreaseTemp(){
		if(acIsOn==true && currentTemperature>minTemperature){
			currentTemperature=currentTemperature-1;
			System.out.println("decreaseTemp by one:"+currentTemperature);
		}
		else{
			System.out.println("Minimum temp has been reached");
		}
		
		return currentTemperature;
	}
	

}
