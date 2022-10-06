package variabletypes;

public class StaticGlobalVariableExample2 {
	//static global variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	public static void main (String[] args) {
		System.out.println("Program Starts");
		//we can access static global variables using classname from here as main() is also static
		System.out.println("default value of age is: "+StaticGlobalVariableExample2.age);
		System.out.println("default value of res is: "+StaticGlobalVariableExample2.res);
		System.out.println("default value of grade is: "+StaticGlobalVariableExample2.grade);
		System.out.println("default value of roi is: "+StaticGlobalVariableExample2.roi);
		System.out.println("**********************************");
		//initialization of static global variable
		StaticGlobalVariableExample2.age=25;
		StaticGlobalVariableExample2.res=true;
		StaticGlobalVariableExample2.grade='A';
		StaticGlobalVariableExample2.roi=6.5f;
		System.out.println("updated value of age is: "+StaticGlobalVariableExample2.age);
		System.out.println("updated value of res is: "+StaticGlobalVariableExample2.res);
		System.out.println("updated value of grade is: "+StaticGlobalVariableExample2.grade);
		System.out.println("updated value of roi is: "+StaticGlobalVariableExample2.roi);
		System.out.println("Program ends");	
	
	}
	

}

/*
any variable declared outside the method body but declared in class body known as Global variable
- if its declared with static keyword dn it will known as static global variable
- static global variables are also known as 'class variable/class member'
	- these variable will be loaded in the memory at the time of compilation when a class file if generated
	- in order access static global variable we can use-
		- we can access static global variable from another static method directly
		- standard -we can access static global variable using class name as they are class member for example:
				classname.staticglobalvariablename
- if we declare any global variable but not initialized and trying used it dn it will give you default value based on data type
*/