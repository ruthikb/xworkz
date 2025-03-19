class CalculatorRunner{
	public static void main(String cal[]){
		int number=150;
		int anotherNumber=47;
		int ref= Calculator.add(number,anotherNumber);
		System.out.println("the sum "+ number+"and"+ anotherNumber +"is:"+ref);
		int total=Calculator.subtract(number,anotherNumber);
		System.out.println("the sub "+ number+"and"+ anotherNumber +"is:"+total);
		int mult=Calculator.multiplication(number,anotherNumber);
		System.out.println("the mult "+ number+"and"+ anotherNumber +"is:"+mult);
		int div=Calculator.division(number,anotherNumber);
		System.out.println("the div "+ number+"and"+ anotherNumber +"is:"+div);
		int mod=Calculator.mode(number,anotherNumber);
		System.out.println("the mod "+ number+"and"+ anotherNumber +"is:"+mod);
	//Calculator.add(150,140);
	//Calculator.subtract(150,50);
	//Calculator.multiplication(150,140);
	//Calculator.division(150,50);
	//Calculator.mode(150,140);
	}
}