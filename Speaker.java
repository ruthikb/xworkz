class Speaker{
	static boolean speakerIsConneceted=false;
	static int currentVolume;
	static int maxVolume=10;
	static int minVolume;
	public static void speakerIsConneceted(){
		if(speakerIsConneceted==false){
			speakerIsConneceted=true;
			System.out.println("speaker is on:");
		}
		else{
			speakerIsConneceted=false;
			System.out.println("speaker is off");
		}
	}
	public static int increaseVolume(){
		if(speakerIsConneceted==true && currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("increaseVolume by one:"+currentVolume);
		}
		else{
			System.out.println("Maximum volume has been reached");
		}
		return currentVolume;
	
	}
	public static int decreaseVolume(){
		if(speakerIsConneceted==true && currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("decreaseVolume by one:"+currentVolume);
		}
		else{
			System.out.println("minVolume has been reached");
		}
		return currentVolume;
	}

}