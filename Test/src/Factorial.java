import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Read user input	
		System.out.println("Enter the number");		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		Factorial fact = new Factorial();
		int result = fact.factorial(num);
		System.out.println(result);
	}
	
	public int factorial(int num){
		if(num <= 0) {
			return 	1;
		}else
			return (num * factorial(num-1));
	}
}
