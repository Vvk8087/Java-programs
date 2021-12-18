package myproject;
import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter a number upto which you want to print a statment:");
	int num = ip.nextInt();
	for(int i=1;i<=num;i++) {
		System.out.println("Hello world");
	}
	}

}