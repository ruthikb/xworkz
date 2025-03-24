class Mat{
	Mat(){
		System.out.println("the constructor got invoked:");
	
	}
	Mat(String meterial ,int weight ,String color){
		this.meterial=meterial;
		this.weight=weight;
		this.color=color;
	
	}
	String meterial;
	int weight;
	String color;

}