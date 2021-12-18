package programs;
import java.util.Scanner;

public class Evenorodd {
	public static void main(String[]args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to check its an even number or an odd number: ");
		int a = num.nextInt();
		if(a%2==0) {
			System.out.println("It's an even number");
		}
		else {
			System.out.println("It's an odd number");
		}
	}

}
