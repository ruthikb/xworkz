class CosmeticRunner{

  public static void main(String arg[]){
  
 Cosmetic cos1 = new Cosmetic();
 cos1.brandAndType="MAC, Foundation";
 cos1.skinType="oily";
 cos1.isWaterproof=true;
 System.out.println("brand And Type :"+cos1.brandAndType);
 System.out.println("skinType  :"+cos1.skinType);
 System.out.println("Waterproff :"+cos1.isWaterproof);
 
 Cosmetic cos2 = new Cosmetic();
 cos2.brandAndType="Maybelline, compact ";
 cos2.skinType="all skin type";
 cos2.isWaterproof=true;
 System.out.println("brand And Type :"+cos2.brandAndType);
 System.out.println("skinType :"+cos2.skinType);
 System.out.println("Waterproof  :"+cos2.isWaterproof);
 
 Cosmetic cos3 = new Cosmetic();
 cos3.brandAndType="Lakme, concelear";
 cos3.skinType="dry";
 cos3.isWaterproof=false;
 System.out.println("brand And Type :"+cos3.brandAndType);
 System.out.println("skinType  :"+cos3.skinType);
 System.out.println("Waterproof  :"+cos3.isWaterproof);
 

 Cosmetic cos4 = new Cosmetic();
 cos4.brandAndType="MyGlam, colourCrrocter";
 cos4.skinType="senstive";
 cos4.isWaterproof=true;
 System.out.println("brandAndType :"+cos4.brandAndType);
 System.out.println("skinType  :"+cos4.skinType);
 System.out.println("Waterproof  :"+cos4.isWaterproof);
 
 Cosmetic cos5 = new Cosmetic();
 cos5.brandAndType="biotique ,sunscreem";
 cos5.skinType="senstive";
 cos5.isWaterproof=false;
 System.out.println("brandAndType :"+cos5.brandAndType);
 System.out.println("skinType  :"+cos5.skinType);
 System.out.println("Waterproof  :"+cos5.isWaterproof);
 
     Cosmetic cos6 = new Cosmetic();
	 cos6.brandAndType="minimiist ,vitamin E seream";
	 cos6.skinType="dry";
	 cos6.isWaterproof=true;
     System.out.println("brandAndType :"+cos6.brandAndType);
     System.out.println("skinType :"+cos6.skinType);
     System.out.println("Waterproof  :"+cos6.isWaterproof);
 
 
     Cosmetic cos7 = new Cosmetic();
	 cos7.brandAndType="l'oreal paris ,primer";
	 cos7.skinType="all skin type";
	 cos7.isWaterproof=true;
     System.out.println("brandAndType :"+cos7.brandAndType);
     System.out.println("skinType  :"+cos7.skinType);
     System.out.println("Waterproof  :"+cos7.isWaterproof);

	  Cosmetic cosmetic1 = new Cosmetic("Lipstick" , "Maybelline" , 499.0);
			System.out.println("Cosmetic Product: "+cosmetic1.product);
			System.out.println("Cosmetic Brand: "+cosmetic1.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic1.price);

        Cosmetic cosmetic2 = new Cosmetic("Foundation", "Lakme", 799.0);
			System.out.println("Cosmetic Product: "+cosmetic2.product);
			System.out.println("Cosmetic Brand: "+cosmetic2.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic2.price);
			
        Cosmetic cosmetic3 = new Cosmetic("Mascara", "L'Oreal", 599.0);
			System.out.println("Cosmetic Product: "+cosmetic3.product);
			System.out.println("Cosmetic Brand: "+cosmetic3.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic3.price);
			
        Cosmetic cosmetic4 = new Cosmetic("Eyeliner", "Revlon", 399.0);
			System.out.println("Cosmetic Product: "+cosmetic4.product);
			System.out.println("Cosmetic Brand: "+cosmetic4.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic4.price);
			
        Cosmetic cosmetic5 = new Cosmetic("Blush", "MAC", 1200.0);
			System.out.println("Cosmetic Product: "+cosmetic5.product);
			System.out.println("Cosmetic Brand: "+cosmetic5.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic5.price);
			
        Cosmetic cosmetic6 = new Cosmetic("Compact Powder", "Colorbar", 650.0);
			System.out.println("Cosmetic Product: "+cosmetic6.product);
			System.out.println("Cosmetic Brand: "+cosmetic6.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic6.price);
			
        Cosmetic cosmetic7 = new Cosmetic("Nail Polish", "Nykaa", 199.0);
			System.out.println("Cosmetic Product: "+cosmetic7.product);
			System.out.println("Cosmetic Brand: "+cosmetic7.brand);
			System.out.println("Cosmetic Price: Rs."+cosmetic7.price);
  
  }
}
