class Calculator{
	public static int add(int number, int anotherNumber){
	int sum=number+anotherNumber;
	return sum;
	}
	public static int subtract(int number,int anotherNumber){
	int sub=number-anotherNumber;
	return sub;
	//System.out.println("the sub "+number+"and"+anotherNumber+"is:"+sub);
	}
	public static int multiplication(int number,int anotherNumber){
	int mul=number*anotherNumber;
	return mul;
	//System.out.println("the mul "+number+"and"+anotherNumber+"is:"+mul);
	}
	public static int division(int number,int anotherNumber){
	int div=number/anotherNumber;
	return div;
	//System.out.println("the div "+number+"and"+anotherNumber+"is:"+div);
	}
	public static int mode(int number,int anotherNumber){
	int mod=number%anotherNumber;
	return mod;
	//System.out.println("the mod "+number+"and"+anotherNumber+"is:"+mod);
	}
}