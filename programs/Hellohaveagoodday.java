package programs;
import java.util.Scanner;

public class Hellohaveagoodday {
	public static void main(String[]args) {
	Scanner str = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = str.nextLine();
	System.out.println("Hello "+name+" have a good day..!");
	
	System.out.println("Enter a number to check if it's an integer or not");
	boolean a = str.hasNextInt();
	System.out.println(a);
		
		
	}
}
