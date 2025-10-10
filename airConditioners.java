class airConditioners{
	static String brand="Godrej";
	static String capacity="1Tons";
	static String Feature="5-in-1 convertible technology with inverter compressor, I Sense Technology,100% copper condenser, evaporator coils & connecting tube, R32 refrigerant, Remote Control, anti-freeze thermostat, Silent Operation, Anti Dust Filter";
	public static void main(String condition[]){
		System.out.println("the brand of the of airconditioners is:" +brand);
		
		System.out.println("the capacity of airconditioners is:" +capacity);
		
		System.out.println("the feature of the airconditioners:" +Feature);
		
		updateairConditioners();
		System.out.println("the brand of the of airconditioners is:" +brand);
		
		System.out.println("the capacity of airconditioners is:" +capacity);
		
		System.out.println("the feature of the airconditioners:" +Feature);
		
	}
public static void updateairConditioners(){
	brand="LG";
	capacity="2Tons";
	 Feature="5-in-1 convertible technology with inverter compressor, I Sense Technology,100% copper condenser, evaporator coils & connecting tube, R32 refrigerant, voice Control, anti-freeze thermostat, Silent Operation, Anti Dust Filter";
	
	
}
}