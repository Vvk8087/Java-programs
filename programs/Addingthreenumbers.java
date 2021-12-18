package programs;
import java.util.Scanner;

public class Addingthreenumbers {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter a First number:");
		int a = ip.nextInt();
		System.out.println("Enter a Second number:");
		int b = ip.nextInt();
		System.out.println("Enter a Third number:");
		int c = ip.nextInt();
		System.out.println("The Sum of three numbers is "+(a+b+c));

	}

}
