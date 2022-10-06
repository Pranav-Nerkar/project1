package ExceptionHandling;

public class FinalizeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finalize - just before destroying any object, garbage collector always calls finalize() to perform clean-up
				// activities on that object
				 
				FinalizeException f1= new FinalizeException();
				System.out.println(f1.hashCode());
				
				f1=null;
				Object objh;
				System.gc();
				System.out.println("Program Ends");		
			}
			public void finalize() {
				System.out.println("Hi, I am your finalize method");
			}
	}