class Airport{
	static int airportId=1;
	static String airportName="kempegowda international airport";
	static String airportLocation="banglore";
	static int terminalNo=2;
	static String airportType="International";
	public static void main(String airport[]){
		
		System.out.println("the id of the airport is:" +airportId);
		
		System.out.println("the name of the airport is:" +airportName);
		
		System.out.println("the location of the airport:" +airportLocation);
		
		System.out.println("the no of terminal in airport is:" +terminalNo);
		
		System.out.println("the type of airport is:" +airportType);		
		
		updateAirport();
		
		System.out.println("the id of the airport is:" +airportId);
		
		System.out.println("the name of the airport is:" +airportName);
		
		System.out.println("the location of the airport:" +airportLocation);
		
		System.out.println("the no of terminal in airport is:" +terminalNo);
		
		System.out.println("the type of airport is:" +airportType);	
		
	}
	public static void updateAirport(){
		airportId=2;
		airportName="chatrapathi shivaji international airport";
		airportLocation="Mumabi";
		terminalNo=1;
		airportType="International";
		
		
		
	}

}