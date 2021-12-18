package myproject;
import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number to check it is even or odd");
		int a = ip.nextInt();
		String check = (a%2==0)? "even":"odd";
		System.out.println(check);
	}

}
