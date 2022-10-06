package Program;

public class SimpleIntrest {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		double Intrest;
		long principle = 10000l;
		double rate =0.15;
		int time = 3;
		Intrest = (principle*rate*time)/100;
		
		System.out.println("Intrest"+Intrest);
		System.out.println("Principle"+principle);
		System.out.println("rate"+rate);
		System.out.println("Time"+time);
		System.out.println("Program Ends");
		

	}

}
