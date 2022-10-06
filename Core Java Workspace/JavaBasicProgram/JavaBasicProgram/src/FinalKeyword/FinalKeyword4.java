package FinalKeyword;

public class FinalKeyword4 {
		final int speedlimit;// blank final variable
		FinalKeyword4() {
			speedlimit = 70;
			System.out.println(speedlimit);//step 1
		}
		public static void main(String args[]) {
			FinalKeyword4 f1=new FinalKeyword4();//object creation by class finalkeyword4
			System.out.println(f1.speedlimit); //step 2
		}
	}
	/**
	Any variable which is declared as final should be initialize at the same time.
	but for Non static global final variable can declared and initialize inside the constructor body
	*/