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
	}
}