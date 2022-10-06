package pack2;

import pack1.ProtectedMembers;
import pack1.PublicMembers;
		//or
import pack1.*;

 class AccessProtectedMembers2 extends ProtectedMembers  {
	 public static void main(String[] args) {
			
			AccessProtectedMembers2 p1=new AccessProtectedMembers2();
			System.out.println("Accessing Protected members from another class outside of package");
			System.out.println(p1.accNum);
			p1.displayAccNum();
		}
	}
	class TestProtectedMembers extends AccessProtectedMembers2{
		public static void main(String[] args) {
		AccessProtectedMembers2 p1=new AccessProtectedMembers2();
		//System.out.println(p1.accNum); //not accessible from child class
		//p1.displayAccNum(); //not accessible from child class
		PublicMembers p2=new PublicMembers();
		}
	}
	/*
	using inheritance we can access protected members from outside the package
	*/