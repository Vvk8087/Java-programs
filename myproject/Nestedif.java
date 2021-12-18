package myproject;
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = num.nextInt();
		if(a>0) {
			System.out.println("It's a positive number");
			if(a%2==0) {
				System.out.println("It's an even number");
			}
			else {
				System.out.println("It's an odd number");
			}
		
		}
		else if(a==0) {
			System.out.println("It's a neutral number");
		}
		else if(a<0) {
			System.out.println("It's a negative number");
			if(a%2==0) {
				System.out.println("It's an even number");
			}
			else {
				System.out.println("It's an odd number");
			}
		}
	} 

}
