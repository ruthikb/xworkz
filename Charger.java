class Charger{
	static int chargerId=1;
	static String brandName ="OnePlus";
	static String color ="red";
	static String power="100W Power Adapter";
	static String typeCharger="Type c charger";
	static int chargerPrice=1234;
	static boolean isWashable = false;
	public static void main(String charger[]){
	 
	System.out.println("the id of the charger is:" +chargerId);
	
	System.out.println("the name og the charger is:" +brandName);
	
	System.out.println("the color oof the charger is:" +color);
	
	System.out.println("the power of the chargeris:" +power);
	
	System.out.println("the type of charger is:" +typeCharger);
	
	System.out.println("the price of charger is:" +chargerPrice);
	
	System.out.println("is the charger washable:" +isWashable);
	
	
	updateCharger();
	
	
	System.out.println("the name og the charger is:" +brandName);
	
	System.out.println("the color oof the charger is:" +color);
	
	System.out.println("the power of the chargeris:" +power);
	
	System.out.println("the type of charger is:" +typeCharger);
	
	System.out.println("the price of charger is:" +chargerPrice);
	
	System.out.println("is the charger washable:" +isWashable);
	}
	public static void updateCharger(){
	  chargerId=12;
	  brandName ="OnePlus nord";
	  color ="black";
	  power="80W Power Adapter";
	  typeCharger="Type b charger";
	  chargerPrice=2234;
	  isWashable = false;
	}
}