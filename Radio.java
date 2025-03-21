class Radio{
	static boolean isOnOrOff=false;
	static int currentVolume;
	static int maxVolume=5;
	static int minVolume;

	public static void isOnOrOff(){
		if(isOnOrOff==false){
			isOnOrOff=true;
			System.out.println("Radio is on:");
		}
		else{
			isOnOrOff=false;
			System.out.println("radio is off:");
		}
	
	}
	public static int increaseVolume(){
		if(isOnOrOff==false && currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("increaseVolume by one:"+currentVolume);
		
		}
		else{
			System.out.println("Volumr has reached max:");
		}
		return currentVolume;
	
	}
	public static int decreaseVolume(){
		if(isOnOrOff==true && currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("decreaseVolume by one:"+currentVolume);
		}
		else{
			System.out.println("Volume has reached min:");
		}
		return currentVolume;
	}

}