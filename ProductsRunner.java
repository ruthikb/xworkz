class ProductsRunner{
	public static void main(String arg[]){
		System.out.println("Products constructor got invoked:");
		Products ref=new Products();
		ref.productId=1;
		ref.name=coldDrinks;
		ref.productDetails="it is the Airited drink which contain Soda";
		ref.price=90;
		ref.expireDate="24-04-2026";
		System.out.println("the productId is:"+ref.productId);
		System.out.println("the name of the product is:"+ref.name);
		System.out.println("the productDetails of the productis "+ref.productDetails);
		System.out.println("the price of the product is :"+ref.price);
		System.out.println("the expireDate of the product is:"+ref.expireDate);
		
		
		Products userInfo=new Products();
		userInfo.productId=2;
		userInfo.name=chocolate;
		userInfo.productDetails="it is done ued almonds and the coco seeds";
		userInfo.price=120;
		userInfo.expireDate="25-05-2027";
		System.out.println("the productId is:"+userInfo.productId);
		System.out.println("the name of the product is:"+userInfo.name);
		System.out.println("the productDetails of the productis "+userInfo.productDetails);
		System.out.println("the price of the product is :"+userInfo.price);
		System.out.println("the expireDate of the product is:"+userInfo.expireDate);
		
		
		Products userdetails=new Products();
		userdetails.productId=3;
		userdetails.name=biscuits;
		userdetails.productDetails="it is done by almonds and the cockies";
		userdetails.price=50;
		userdetails.expireDate="26-06-2028";
		System.out.println("the productId is:"+userInfo.productId);
		System.out.println("the name of the product is:"+userInfo.name);
		System.out.println("the productDetails of the productis "+userInfo.productDetails);
		System.out.println("the price of the product is :"+userInfo.price);
		System.out.println("the expireDate of the product is:"+userInfo.expireDate);
	}
}