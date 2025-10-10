class Dishwashing{
	static String brand="lg";
	static String capacity="14load";
	static String dimension=("60D x 60W x 85H Centimeters");
	static String festure="Auto Program, Adjustable Height, Half Load, Adjustable Rack, Smart";
	public static void main(String washing[]){
		
		System.out.println("the name of the dishwasher is :"+brand);
		
		System.out.println("the capacity of the dishwasher is:"+capacity);
		
		System.out.println("the dimension of the dishwasher is:"+dimension);
		
		System.out.println("the festure of the dishwasher is:"+festure);
		updateDishwashing();
		System.out.println("the name of the dishwasher is :"+brand);
		
		System.out.println("the capacity of the dishwasher is:"+capacity);
		
		System.out.println("the dimension of the dishwasher is:"+dimension);
		
		System.out.println("the festure of the dishwasher is:"+festure);
		
	}
	public static void updateDishwashing(){
		brand="Godrej";
	   capacity="15load";
	  dimension=("60D x 70W x 85H Centimeters");
	  festure="Auto Program, Half Load, Adjustable Rack, Smart";
		
		
	}
}