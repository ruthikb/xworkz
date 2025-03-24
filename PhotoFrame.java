class PhotoFrame{
	PhotoFrame(){
	System.out.println("the constructor got invoked:");
	}
	PhotoFrame(String brand,String color,int price){
	this.brand=brand;
	this.color=color;
	this.price=price;
}
String brand;
String color;
int price;
}