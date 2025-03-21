class Pc{
	static String brand="SKULLSAINTS";
	static String operatingSystem="Windows 11 Pro";
	static String cpuSpeed="3.4 GHz";
	static String graphicsCard="integrated";
	public static void main(String pc[]){
		
		System.out.println("the brand of the pc is:"+brand);
		
		System.out.println("the operatingSystem of thd pc is:"+operatingSystem);
		
		System.out.println("the cpu speed of the pc is:"+cpuSpeed);
		
		System.out.println("the graphicsCardof the pc is:"+graphicsCard);
		updatePc();
		System.out.println("the brand of the pc is:"+brand);
		
		System.out.println("the operatingSystem of thd pc is:"+operatingSystem);
		
		System.out.println("the cpu speed of the pc is:"+cpuSpeed);
		
		System.out.println("the graphicsCardof the pc is:"+graphicsCard);
	}
	
	public static void updatePc(){
	 brand="SKULLSAINTS";
	 operatingSystem="Windows 12 Pro";
	 cpuSpeed="4.4 GHz";
	 graphicsCard="integrated";
	}
}