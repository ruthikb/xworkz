class Fan{
	static boolean isOnOrOff= false;
	static int currentSpeed;
	static int maxSpeed=5;
	static int minSpeed;
	public static  void isOnOrOff(){
	if(isOnOrOff==false){
		isOnOrOff=true;
		System.out.println("Fan is on:");
	}
	else{
		isOnOrOff=false;
		System.out.println("fan is off:");
	}
 

 }
 public static int increaseSpeed(){
		if(isOnOrOff==true && currentSpeed<maxSpeed){
			currentSpeed=currentSpeed+1;
			System.out.println("increaseSpeed by one:"+currentSpeed);
		}
		else{
			System.out.println("maxSpeed has been reached");
		}
		return currentSpeed;
 }
 public static int decreaseSpeed(){
	if(isOnOrOff==true && currentSpeed>minSpeed){
		currentSpeed=currentSpeed-1;
		System.out.println("decreaseSpeed by one:"+currentSpeed);
	}
	else{
		System.out.println("minSpeed has been reached");
	}
	return currentSpeed;
 }

}