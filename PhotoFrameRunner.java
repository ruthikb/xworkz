class PhotoFrameRunner{
	public static void main(String arg[]){
	
	PhotoFrame frame=new PhotoFrame();
	frame.brand="amazon basics";
	frame.color="Black";
	frame.price=950;
	System.out.println("the brand of the frame is:"+frame.brand);
	System.out.println("the color of the frame is:"+frame.color);
	System.out.println("the price of the frame is:"+frame.price);
	
	PhotoFrame frame1=new PhotoFrame();
	frame1.brand="giftsnplaques";
	frame1.color="Transparent";
	frame1.price=1199;
	System.out.println("the brand of the frame is:"+frame1.brand);
	System.out.println("the color of the frame is:"+frame1.color);
	System.out.println("the price of the frame is:"+frame1.price);
	
	PhotoFrame frame2=new PhotoFrame();
	frame2.brand="Ellementry";
	frame2.color="Brown";
	frame2.price=760;
	System.out.println("the brand of the frame is:"+frame2.brand);
	System.out.println("the color of the frame is:"+frame2.color);
	System.out.println("the price of the frame is:"+frame2.price);
	
	PhotoFrame frame3=new PhotoFrame();
	frame3.brand="	Dev Aastha";
	frame3.color="Black";
	frame3.price=950;
	System.out.println("the brand of the frame is:"+frame3.brand);
	System.out.println("the color of the frame is:"+frame3.color);
	System.out.println("the price of the frame is:"+frame3.price);
	
	PhotoFrame frame4=new PhotoFrame();
	frame4.brand="Art Street";
	frame4.color="Black";
	frame4.price=550;
	System.out.println("the brand of the frame is:"+frame4.brand);
	System.out.println("the color of the frame is:"+frame4.color);
	System.out.println("the price of the frame is:"+frame4.price);
	
	PhotoFrame frame5=new PhotoFrame();
	frame5.brand="Stone Essential";
	frame5.color="white";
	frame5.price=900;
	System.out.println("the brand of the frame is:"+frame5.brand);
	System.out.println("the color of the frame is:"+frame5.color);
	System.out.println("the price of the frame is:"+frame5.price);
	
	PhotoFrame frame6=new PhotoFrame();
	frame6.brand="Art Street";
	frame6.color="gold";
	frame6.price=950;
	System.out.println("the brand of the frame is:"+frame6.brand);
	System.out.println("the color of the frame is:"+frame6.color);
	System.out.println("the price of the frame is:"+frame6.price);

		 PhotoFrame frame1 = new PhotoFrame("Wood" , "8x10 inches" , 500.0);
			System.out.println("Photo Frame Material: "+frame1.material);
			System.out.println("Photo Frame Size: "+frame1.size);
			System.out.println("Photo Frame Price: Rs."+frame1.price);

        PhotoFrame frame2 = new PhotoFrame("Metal", "12x16 inches", 750.0);
			System.out.println("Photo Frame Material: "+frame2.material);
			System.out.println("Photo Frame Size: "+frame2.size);
			System.out.println("Photo Frame Price: Rs."+frame2.price);
			
        PhotoFrame frame3 = new PhotoFrame("Plastic", "5x7 inches", 300.0);
			System.out.println("Photo Frame Material: "+frame3.material);
			System.out.println("Photo Frame Size: "+frame3.size);
			System.out.println("Photo Frame Price: Rs."+frame3.price);
			
        PhotoFrame frame4 = new PhotoFrame("Glass", "10x12 inches", 850.0);
			System.out.println("Photo Frame Material: "+frame4.material);
			System.out.println("Photo Frame Size: "+frame4.size);
			System.out.println("Photo Frame Price: Rs."+frame4.price);
			
        PhotoFrame frame5 = new PhotoFrame("Acrylic", "14x18 inches", 1000.0);
			System.out.println("Photo Frame Material: "+frame5.material);
			System.out.println("Photo Frame Size: "+frame5.size);
			System.out.println("Photo Frame Price: Rs."+frame5.price);
			
        PhotoFrame frame6 = new PhotoFrame("Wood", "16x20 inches", 1200.0);
			System.out.println("Photo Frame Material: "+frame6.material);
			System.out.println("Photo Frame Size: "+frame6.size);
			System.out.println("Photo Frame Price: Rs."+frame6.price);
			
        PhotoFrame frame7 = new PhotoFrame("Metal", "20x24 inches", 1500.0);
			System.out.println("Photo Frame Material: "+frame7.material);
			System.out.println("Photo Frame Size: "+frame7.size);
			System.out.println("Photo Frame Price: Rs."+frame7.price);
	}

}
