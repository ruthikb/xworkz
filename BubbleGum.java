class BubbleGum{

 BubbleGum(){
  System.out.println("bubble gum constructor is invoked");
 }
 BubbleGum(String name,int price,String flavor){
    this.name=name;
	this.price=price;
	this.flavor=flavor;
 }
	String name;
	int price;
	String flavor;
}