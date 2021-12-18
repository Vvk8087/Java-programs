package programs;
import java.util.Scanner;

public class Printoddnmberusingforloop {
	public static void main(String[]args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number upto which you want odd numbers:");
		int num = ip.nextInt();
		for(int i=0;i<=num;i++) {
			System.out.println((2*i+1)); //use 2*i for even numbers printing

		}
	}
}
