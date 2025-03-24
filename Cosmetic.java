class Cosmetic{
 Cosmetic(){
 System.out.println("constructor is invoked");
 }

 Cosmetic(String brandAndType, String skinType, boolean isWaterproof){
 this.brandAndType = brandAndType;
 this.skinType = skinType;
 this.isWaterproof = isWaterproof;
  
 }
  String brandAndType;
 String skinType;
 boolean isWaterproof;
}