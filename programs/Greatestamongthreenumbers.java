package programs;
import java.util.Scanner;

public class Greatestamongthreenumbers {
	public static void main(String[]args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a first number  ");
		int a = num.nextInt();
		System.out.println("Enter a second number  ");
		int b = num.nextInt();
		System.out.println("Enter a third number  ");
		int c = num.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>c) { 
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
