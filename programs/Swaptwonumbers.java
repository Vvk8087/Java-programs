package programs;
import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = ip.nextInt();
		System.out.println("Enter number b:");
		int b = ip.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap a is: "+a+" and after swap b is: "+b);


	}
}
