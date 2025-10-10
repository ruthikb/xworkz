class Processor{
	static int processorId=1;
	static String processorName="intel";
	static String processorGen="12th gen";
	static String clockSpeed="3.6 GHz";
	public static void main(String processor[]){
		
		System.out.println("the id of the processor is:" +processorId);
		
		System.out.println("the name of the processoris:" +processorName);
		
		System.out.println("the generation of the processor is" +processorGen);
		
		System.out.println("the clockSpeed of the processor is" +clockSpeed);
		
		updateProcessor();
		System.out.println("the id of the processor is:" +processorId);
		
		System.out.println("the name of the processoris:" +processorName);
		
		System.out.println("the generation of the processor is" +processorGen);
		
		System.out.println("the clockSpeed of the processor is" +clockSpeed);
	
	}
	public static void updateProcessor(){
		 processorId=123;
	 processorName="AMD";
	 processorGen="13th gen";
	 clockSpeed="4.6 GHz";
	}
}