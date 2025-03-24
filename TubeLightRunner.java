class TubeLightRunner{
	public static void main(String arg[]){
		TubeLight light=new TubeLight();
		light.type="led";
		light.watts=240;
		light.feature="Energy Efficient";
		System.out.println("the type of light is:"+light.type);
		System.out.println("the watts of the light is:"+light.watts);
		System.out.println("the feature of the light is:"+light.feature);
		
		TubeLight light1=new TubeLight();
		light1.type="led";
		light1.watts=240;
		light1.feature="Energy Efficient";
		System.out.println("the type of light is:"+light1.type);
		System.out.println("the watts of the light is:"+light1.watts);
		System.out.println("the feature of the light is:"+light1.feature);
		
		TubeLight light2=new TubeLight();
		light2.type="led";
		light2.watts=360;
		light2.feature="Energy Efficient";
		System.out.println("the type of light is:"+light2.type);
		System.out.println("the watts of the light is:"+light2.watts);
		System.out.println("the feature of the light is:"+light2.feature);
		
		TubeLight light3=new TubeLight();
		light3.type="led";
		light3.watts=200;
		light3.feature="Energy Efficient";
		System.out.println("the type of light is:"+light3.type);
		System.out.println("the watts of the light is:"+light3.watts);
		System.out.println("the feature of the light is:"+light3.feature);
		
		TubeLight light4=new TubeLight();
		light4.type="led";
		light4.watts=440;
		light4.feature="Energy Efficient";
		System.out.println("the type of light is:"+light4.type);
		System.out.println("the watts of the light is:"+light4.watts);
		System.out.println("the feature of the light is:"+light4.feature);
		
		TubeLight light5=new TubeLight();
		light5.type="RGB";
		light5.watts=20;
		light5.feature="Ceiling";
		System.out.println("the type of light is:"+light5.type);
		System.out.println("the watts of the light is:"+light5.watts);
		System.out.println("the feature of the light is:"+light5.feature);
		
		TubeLight light6=new TubeLight();
		light6.type="Incandesent";
		light6.watts=350;
		light6.feature="Energy ";
		System.out.println("the type of light is:"+light6.type);
		System.out.println("the watts of the light is:"+light6.watts);
		System.out.println("the feature of the light is:"+light6.feature);

		TubeLight tube1 = new TubeLight("Philips" ,  40 , 300.0);
			System.out.println("TubeLight Brand: "+tube1.brand);
			System.out.println("TubeLight Wattage: "+tube1.wattage);
			System.out.println("TubeLight Price: Rs."+tube1.price);

        TubeLight tube2 = new TubeLight("Havells", 50, 450.0);
			System.out.println("TubeLight Brand: "+tube2.brand);
			System.out.println("TubeLight Wattage: "+tube2.wattage);
			System.out.println("TubeLight Price: Rs."+tube2.price);
			
        TubeLight tube3 = new TubeLight("Syska", 30, 250.0);
			System.out.println("TubeLight Brand: "+tube3.brand);
			System.out.println("TubeLight Wattage: "+tube3.wattage);
			System.out.println("TubeLight Price: Rs."+tube3.price);
			
        TubeLight tube4 = new TubeLight("Wipro", 60, 500.0);
			System.out.println("TubeLight Brand: "+tube4.brand);
			System.out.println("TubeLight Wattage: "+tube4.wattage);
			System.out.println("TubeLight Price: Rs."+tube4.price);
			
        TubeLight tube5 = new TubeLight("Eveready", 36, 280.0);
			System.out.println("TubeLight Brand: "+tube5.brand);
			System.out.println("TubeLight Wattage: "+tube5.wattage);
			System.out.println("TubeLight Price: Rs."+tube5.price);
			
        TubeLight tube6 = new TubeLight("Surya", 48, 320.0);
			System.out.println("TubeLight Brand: "+tube6.brand);
			System.out.println("TubeLight Wattage: "+tube6.wattage);
			System.out.println("TubeLight Price: Rs."+tube6.price);
			
        TubeLight tube7 = new TubeLight("Bajaj", 42, 350.0);
			System.out.println("TubeLight Brand: "+tube7.brand);
			System.out.println("TubeLight Wattage: "+tube7.wattage);
			System.out.println("TubeLight Price: Rs."+tube7.price);
	}
}
