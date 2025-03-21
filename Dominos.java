class Dominos{
	public static int rate(String productName) {
        int price = 0;
        
        if (productName == " Peppy Panner") {  
            price = 299;
            return price;
        }
		else{
			System.out.println("productName not found:");
		}
		return price;

}
public static int rate(String productName,int Quantity){
	int price =0;
	if (productName == "peppy Panner"){
		price =299*Quantity;
		return price;
	}
	else{
		
		System.out.println("productName not found");
	}
	return price;
}
}