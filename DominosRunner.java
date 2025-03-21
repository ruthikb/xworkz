class DominosRunner{
	public static void main(String arg[]){
	int price =Dominos.rate("Peppy Panner");
	int priceWithQuantity=Dominos.rate("Peppy Panner",9);
	System.out.println(price);
	System.out.println(priceWithQuantity);
	}
}