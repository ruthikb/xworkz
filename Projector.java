class Projector{
	static boolean isConnected=false;
	static int currentVolume;
	static int maxVolume=10;
	static int minVolume;
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
	public static int increaseVolume(){
		if(isConnected==false && currentVolume<maxVolume ){
			currentVolume=currentVolume+1;
			System.out.println("increaseVolume by one:"+currentVolume);
		}
		else{
			System.out.println("Maximum volume has been reached");
		}
		return currentVolume;
	
	}
	public static int decreaseVolume(){
		if(isConnected==false && currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("decreaseVolume by one :"+currentVolume);
		}
		else{
			System.out.println("minimum volume has been reached");
		}
		return currentVolume;
	
	}

}