class MatRunner{
	public static void main(String arg[]){
	
		Mat mat=new Mat();
		mat.meterial="Rubber";
		mat.weight=390;
		mat.color="Blue";
		System.out.println("the meterial of the mat is :"+mat.meterial);
		System.out.println("the weight of the mat is:"+mat.weight);
		System.out.println("the color of the mat is:"+mat.color);
		
		Mat mat1=new Mat();
		mat1.meterial="Rubber";
		mat1.weight=790;
		mat1.color="Grey";
		System.out.println("the meterial of the mat is :"+mat1.meterial);
		System.out.println("the weight of the mat is:"+mat1.weight);
		System.out.println("the color of the mat is:"+mat1.color);
		
		Mat mat2=new Mat();
		mat2.meterial="Polypropylene";
		mat2.weight=350;
		mat2.color="Blue";
		System.out.println("the meterial of the mat is :"+mat2.meterial);
		System.out.println("the weight of the mat is:"+mat2.weight);
		System.out.println("the color of the mat is:"+mat2.color);
		
		
		Mat mat3=new Mat();
		mat3.meterial="Microfiber";
		mat3.weight=390;
		mat3.color="Blue";
		System.out.println("the meterial of the mat is :"+mat3.meterial);
		System.out.println("the weight of the mat is:"+mat3.weight);
		System.out.println("the color of the mat is:"+mat3.color);
		
		
		Mat mat4=new Mat();
		mat4.meterial="Rubber";
		mat4.weight=360;
		mat4.color="Grey";
		System.out.println("the meterial of the mat is :"+mat4.meterial);
		System.out.println("the weight of the mat is:"+mat4.weight);
		System.out.println("the color of the mat is:"+mat4.color);
		
		
		Mat mat5=new Mat();
		mat5.meterial="Microfiber";
		mat5.weight=350;
		mat5.color="green";
		System.out.println("the meterial of the mat is :"+mat5.meterial);
		System.out.println("the weight of the mat is:"+mat5.weight);
		System.out.println("the color of the mat is:"+mat5.color);
		
		
		Mat mat6=new Mat();
		mat6.meterial="cotten";
		mat6.weight=300;
		mat6.color="Light Taupe";
		System.out.println("the meterial of the mat is :"+mat6.meterial);
		System.out.println("the weight of the mat is:"+mat6.weight);
		System.out.println("the color of the mat is:"+mat6.color);

		Mat mat1 = new Mat("Cotton" , "Large" , 600.0);
			System.out.println("Mat Material: "+mat1.material);
			System.out.println("Mat Size: "+mat1.size);
			System.out.println("Mat Price: Rs."+mat1.price);

        Mat mat2 = new Mat("Rubber", "Medium", 400.0);
			System.out.println("Mat Material: "+mat2.material);
			System.out.println("Mat Size: "+mat2.size);
			System.out.println("Mat Price: Rs."+mat2.price);
			
        Mat mat3 = new Mat("Jute", "Small", 350.0);
			System.out.println("Mat Material: "+mat3.material);
			System.out.println("Mat Size: "+mat3.size);
			System.out.println("Mat Price: Rs."+mat3.price);
			
        Mat mat4 = new Mat("Polyester", "Extra Large", 800.0);
			System.out.println("Mat Material: "+mat4.material);
			System.out.println("Mat Size: "+mat4.size);
			System.out.println("Mat Price: Rs."+mat4.price);
			
        Mat mat5 = new Mat("Wool", "Medium", 700.0);
			System.out.println("Mat Material: "+mat5.material);
			System.out.println("Mat Size: "+mat5.size);
			System.out.println("Mat Price: Rs."+mat5.price);
			
        Mat mat6 = new Mat("Bamboo", "Large", 900.0);
			System.out.println("Mat Material: "+mat6.material);
			System.out.println("Mat Size: "+mat6.size);
			System.out.println("Mat Price: Rs."+mat6.price);
			
        Mat mat7 = new Mat("Foam", "Small", 500.0);
			System.out.println("Mat Material: "+mat7.material);
			System.out.println("Mat Size: "+mat7.size);
			System.out.println("Mat Price: Rs."+mat7.price);
	}

}
