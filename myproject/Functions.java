package myproject;
import java.util.Scanner;

public class Functions {

	public static void factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			}
		System.out.println("The factorial of "+a+" is "+fact);
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the value of which factorial you want");
		int a= ip.nextInt();
		factorial(a);
	}

}
