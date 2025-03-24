class VaseRunner{
	public static void main(String arg[]){
		Vase vase=new Vase();
		vase.shape="cylindrical";
		vase.brand="TIED RIBBONS";
		vase.price=1234;
		System.out.println("the shape of the vase is:"+vase.shape);
		System.out.println("the brand of the vase is:"+vase.brand);
		System.out.println("the price of the vase is:"+vase.price);
		
		Vase vase1=new Vase();
		vase1.shape="Rectangular";
		vase1.brand="Glimpse Homes";
		vase1.price=1199;
		System.out.println("the shape of the vase is:"+vase1.shape);
		System.out.println("the brand of the vase is:"+vase1.brand);
		System.out.println("the price of the vase is:"+vase1.price);
		
		
		Vase vase2=new Vase();
		vase2.shape="Oval";
		vase2.brand="Glimpse Homes";
		vase2.price=1299;
		System.out.println("the shape of the vase is:"+vase2.shape);
		System.out.println("the brand of the vase is:"+vase2.brand);
		System.out.println("the price of the vase is:"+vase2.price);
		
		
		Vase vase3=new Vase();
		vase3.shape="Donut Shape";
		vase3.brand="SPHINX";
		vase3.price=1399;
		System.out.println("the shape of the vase is:"+vase3.shape);
		System.out.println("the brand of the vase is:"+vase3.brand);
		System.out.println("the price of the vase is:"+vase3.price);
		
		
		Vase vase4=new Vase();
		vase4.shape="cone";
		vase4.brand="bvslf";
		vase4.price=1499;
		System.out.println("the shape of the vase is:"+vase4.shape);
		System.out.println("the brand of the vase is:"+vase4.brand);
		System.out.println("the price of the vase is:"+vase4.price);
		
		
		Vase vase5=new Vase();
		vase5.shape="Bottle";
		vase5.brand="PulGos";
		vase5.price=1599;
		System.out.println("the shape of the vase is:"+vase5.shape);
		System.out.println("the brand of the vase is:"+vase5.brand);
		System.out.println("the price of the vase is:"+vase5.price);
		
		Vase vase6=new Vase();
		vase6.shape="Round";
		vase6.brand="ANCIENT SHOPPEE";
		vase6.price=1600;
		System.out.println("the shape of the vase is:"+vase6.shape);
		System.out.println("the brand of the vase is:"+vase6.brand);
		System.out.println("the price of the vase is:"+vase6.price);

		Vase vase1 = new Vase("Ceramic" , "Blue" , 450.0);
			System.out.println("Vase Material: "+vase1.material);
			System.out.println("Vase Colour: "+vase1.color);
			System.out.println("Vase Price: Rs."+vase1.price);

        Vase vase2 = new Vase("Glass", "Transparent", 600.0);
			System.out.println("Vase Material: "+vase2.material);
			System.out.println("Vase Colour: "+vase2.color);
			System.out.println("Vase Price: Rs."+vase2.price);
			
        Vase vase3 = new Vase("Clay", "Brown", 350.0);
			System.out.println("Vase Material: "+vase3.material);
			System.out.println("Vase Colour: "+vase3.color);
			System.out.println("Vase Price: Rs."+vase3.price);
			
        Vase vase4 = new Vase("Metal", "Gold", 1200.0);
			System.out.println("Vase Material: "+vase4.material);
			System.out.println("Vase Colour: "+vase4.color);
			System.out.println("Vase Price: Rs."+vase4.price);
			
        Vase vase5 = new Vase("Plastic", "White", 250.0);
			System.out.println("Vase Material: "+vase5.material);
			System.out.println("Vase Colour: "+vase5.color);
			System.out.println("Vase Price: Rs."+vase5.price);
			
        Vase vase6 = new Vase("Stone", "Black", 800.0);
			System.out.println("Vase Material: "+vase6.material);
			System.out.println("Vase Colour: "+vase6.color);
			System.out.println("Vase Price: Rs."+vase6.price);
			
        Vase vase7 = new Vase("Wooden", "Dark Brown", 700.0);
			System.out.println("Vase Material: "+vase7.material);
			System.out.println("Vase Colour: "+vase7.color);
			System.out.println("Vase Price: Rs."+vase7.price);
	}

}
