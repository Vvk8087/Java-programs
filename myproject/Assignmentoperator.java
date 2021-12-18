package myproject;
import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = ip.nextInt();
		System.out.println("a+=: "+(a+=5));
		System.out.println("a*=: "+(a*=4));
		System.out.println("a-=: "+(a-=10));
		System.out.println("a/=: "+(a/=13));
		System.out.println("a%=: "+(a%=2));

	}

}
