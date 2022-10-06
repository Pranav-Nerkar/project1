package for_loop;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num = 10, sum = 0;  
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i; //sum +=i
		}  
		//prints the sum   
		System.out.println("Sum = " + sum);  
		
	}

}