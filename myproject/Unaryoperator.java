package myproject;
import java.util.Scanner;

public class Unaryoperator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = ip.nextInt();
		System.out.println("Enter the value of b: ");
		int b = ip.nextInt();
		int c = ++b + ++a + b++ + b-- + ++a;
		System.out.println(c);
		
	}
}	