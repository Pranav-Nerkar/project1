package WrapperClass;

public class BoxingOperation {

	public static void main(String[] args) {
		int age = 20;
		System.out.println("Age: " +age);//20
		
		Integer obj = 45;//implicit auto boxing---->java compiler convert it into Integer
		//Integer obj = new Integer(45);
		System.out.println("obj: " +obj);//45
		
		Integer intObj1 = new Integer(age);//explicit boxing operation
		
		System.out.println("intObj1: "+intObj1);//20
		System.out.println("age==intobj1");
		Integer intobj2 = new Integer(50);//explicit boxing operation
		System.out.println("intobj2: " +intobj2);
		Integer intobj3 = 30;//implicit boxing operation or auto boxing operation
		System.out.println("intobj3: "+intobj3);
		
		char c1 ='z';
		Character xyz = c1;//implicit
		Character cobj2 = new Character(c1);//explicit
		System.out.println("c1");
		System.out.println(xyz);
		System.out.println(cobj2);
	}
}