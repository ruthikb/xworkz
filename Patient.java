class Patient{
	static int patientId;
	static String patientName;
	static char gender;
	
	public static void main(String record[]){
		System.out.println("the patient id is:"+ patientId);
		System.out.println("the pa name is:" + patientName);
		System.out.println("the patient gender is:"+ gender);
		updatePatient();
		System.out.println("the patient id is:"+ patientId);
		System.out.println("the pa name is:" + patientName);
		System.out.println("the patient gender is:"+ gender);
	}
	public static void updatePatient(){
	 patientId=123;
	 patientName="Baba";
	 gender='m';
	}
}