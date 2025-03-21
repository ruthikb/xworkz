class TeaStall{
static String name="Baba's tea stall";
public static void main(String stall[]){
	updateName();
 //String name ="Babu's tea stall";
	System.out.println("the TeaStall name is:"+name);
	System.out.println("name after re-init");
	System.out.println("the TeaStall name is:"+name);
}

public static void updateName(){
	name ="Babu's tea stall";
	
}
}