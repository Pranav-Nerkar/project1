package Statements;

public class SwitchCase1 {
	public static void main(String args[]) {
		int value = 3;
		switch(value) {
		case 1:
			System.out.println("Congratulations here is the case 1 executed");
			break;//break the current flow
		case 2:
			System.out.println("Congratulations here is the case 2 executed");
			break;
		case 3:
			System.out.println("Congratulations here is the case 3 executed");//
			break;
			default://is not a mandatory
				System.out.println("Sorry none of your cases matched");
				break;
		}
	}
}

/*
 * break: means terminate/break the current flow
 * default: is not a mandatory case
 */ 