class ColdDrink{
	ColdDrink(){
		System.out.println("the constructorgot invoked");
	}
	ColdDrink(String brand,String itemForm,String flovour){
	
		this.brand=brand;
		this.itemForm=itemForm;
		this.flovour=flovour;
	}
	String brand;
	String itemForm;
	String flovour;

}