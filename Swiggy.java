class Swiggy{
	public static double foodPrice(String list){
		double cost=0.0;
		if (list == "Aloo Jeera"){
			cost=170.00;
			return cost;
		}
		else{
			System.out.println("list not found:");
		}
		return cost;
		}
		public static double foodPrice(String list,int Quality){
			double cost=0.0;
			if(list =="Aloo Jeera"){
				cost=170.00*Quality;
				return cost;
			}
			else{
				System.out.println("list not found:");
		}
		return cost;
		}
		}