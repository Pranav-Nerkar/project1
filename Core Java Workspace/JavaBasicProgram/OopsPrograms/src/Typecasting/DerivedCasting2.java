package Typecasting;
class Member {
	// Memmber variable of this class
	long phone;
	// Member function of this class
	void chat() {
		// Print message of Member/ Child class
		System.out.println("chatting in whatsapp group with "+phone);
	}
}
class Admin extends Member {
	// Member function of this class
	void addNumber() {
		// Print message of Admin/ Parent class
		System.out.println("adding a new user number in whatsapp group");
	}
}
public class DerivedCasting2 {
	// Main driver method
	public static void main(String[] args) {
		// Creating an object Ad
				Member mem = new Admin();//upcasting -implicit 
				mem.phone = 9876543210l;
				// Calling function
				mem.chat();		
				System.out.println("********** After downcasting ********");
				Admin ad = (Admin) mem; // Downcast to access specific property of subclass
				ad.addNumber();
				ad.chat();
				System.out.println(ad.phone);		
				//Admin a1=new Member();//direct downcasting, invalid or not possible
	}
}