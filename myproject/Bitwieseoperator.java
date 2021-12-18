package myproject;
import java.util.Scanner;

public class Bitwieseoperator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = ip.nextInt();
		System.out.println("Enter the value of b: ");
		int b = ip.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);


	}

}
