class TubeLight{
	TubeLight(){
		System.out.println("the constructor got invoked");
	
	}
	TubeLight(String type, int watts,String feature){
	
	 this.type=type;
	 this.watts=watts;
	 this.feature=feature;
	}
	String type;
	int watts;
	String feature;

}