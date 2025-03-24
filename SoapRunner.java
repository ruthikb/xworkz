class SoapRunner{
	public static void main(String arg[]){
		Soap soap=new Soap();
		soap.brand="Lux";
		soap.price=123;
		soap.scent="Lavender";
		System.out.println("the soap brand is :"+soap.brand);
		System.out.println("the soap price is:"+soap.price);
		System.out.println("the soap scent is:"+soap.scent);
		
		Soap soap1=new Soap();
		soap1.brand="Dove";
		soap1.price=150;
		soap1.scent="Floral";
		System.out.println("the soap brand is :"+soap1.brand);
		System.out.println("the soap price is:"+soap1.price);
		System.out.println("the soap scent is:"+soap1.scent);
		
		Soap soap2=new Soap();
		soap2.brand="Santoor";
		soap2.price=169;
		soap2.scent="Sandalwood";
		System.out.println("the soap brand is :"+soap2.brand);
		System.out.println("the soap price is:"+soap2.price);
		System.out.println("the soap scent is:"+soap2.scent);
		
		Soap soap3=new Soap();
		soap3.brand="Park Avenue";
		soap3.price=144;
		soap3.scent="Fresh";
		System.out.println("the soap brand is :"+soap3.brand);
		System.out.println("the soap price is:"+soap3.price);
		System.out.println("the soap scent is:"+soap3.scent);
		
		Soap soap4=new Soap();
		soap4.brand="Cinthol";
		soap4.price=195;
		soap4.scent="Lemon";
		System.out.println("the soap brand is :"+soap4.brand);
		System.out.println("the soap price is:"+soap4.price);
		System.out.println("the soap scent is:"+soap4.scent);
		
		Soap soap5=new Soap();
		soap5.brand="PEARS";
		soap5.price=361;
		soap5.scent="Pear";
		System.out.println("the soap brand is :"+soap5.brand);
		System.out.println("the soap price is:"+soap5.price);
		System.out.println("the soap scent is:"+soap5.scent);
		
		Soap soap6=new Soap();
		soap6.brand="Dettol";
		soap6.price=132;
		soap6.scent="Cologne";
		System.out.println("the soap brand is :"+soap6.brand);
		System.out.println("the soap price is:"+soap6.price);
		System.out.println("the soap scent is:"+soap6.scent);
		Soap soap1 = new Soap("Lux" , "Rose" , 40.0);
			System.out.println("Soap Brand: "+soap1.brand);
			System.out.println("Soap Fragance: "+soap1.fragrance);
			System.out.println("Soap Price: Rs."+soap1.price);

        Soap soap2 = new Soap("Dove", "Milk", 60.0);
			System.out.println("Soap Brand: "+soap2.brand);
			System.out.println("Soap Fragance: "+soap2.fragrance);
			System.out.println("Soap Price: Rs."+soap2.price);
			
        Soap soap3 = new Soap("Pears", "Glycerin", 75.0);
			System.out.println("Soap Brand: "+soap3.brand);
			System.out.println("Soap Fragance: "+soap3.fragrance);
			System.out.println("Soap Price: Rs."+soap3.price);
			
        Soap soap4 = new Soap("Lifebuoy", "Herbal", 35.0);
			System.out.println("Soap Brand: "+soap4.brand);
			System.out.println("Soap Fragance: "+soap4.fragrance);
			System.out.println("Soap Price: Rs."+soap4.price);
			
        Soap soap5 = new Soap("Santoor", "Sandal", 50.0);
			System.out.println("Soap Brand: "+soap5.brand);
			System.out.println("Soap Fragance: "+soap5.fragrance);
			System.out.println("Soap Price: Rs."+soap5.price);
			
        Soap soap6 = new Soap("Medimix", "Ayurvedic", 55.0);
			System.out.println("Soap Brand: "+soap6.brand);
			System.out.println("Soap Fragance: "+soap6.fragrance);
			System.out.println("Soap Price: Rs."+soap6.price);
			
        Soap soap7 = new Soap("Mysore Sandal", "Sandalwood", 90.0);
			System.out.println("Soap Brand: "+soap7.brand);
			System.out.println("Soap Fragance: "+soap7.fragrance);
			System.out.println("Soap Price: Rs."+soap7.price);
	}

}
