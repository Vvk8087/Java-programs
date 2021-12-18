package programs;
import java.util.Scanner;

public class Factorialofanumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number of which factorial you want:");
		int num = ip.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);
	}

}
