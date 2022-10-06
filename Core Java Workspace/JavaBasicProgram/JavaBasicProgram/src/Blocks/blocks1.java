package Blocks;

public class blocks1 {
	blocks1(){
		this(10);
		System.out.println("zero-para cons..");
	}
	blocks1(int i){
		System.out.println("int-para cons..");
	}
	static {
		System.out.println("running static-block1 of class block2..");
	}
	//non static block
	{
	System.out.println("running non-static-block-1 of class Blocks4..");
}

public static void main(String[] args) {
	System.out.println("main() Starts");
	blocks1 b1 = new blocks1();
	System.out.println("---------------------------------");
	blocks1 b2 = new blocks1();
	System.out.println("main() ends");
}
/* static block or SIB*/
static {		
	System.out.println("running static-block-2 of class Blocks2..");		
}
/* non-static block or IIB*/
{
	System.out.println("running non-static-block-2 of class Blocks4..");
}
}	