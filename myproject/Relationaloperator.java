package myproject;
import java.util.Scanner;

public class Relationaloperator {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a = ip.nextInt();
	System.out.println("Enter the value of b: ");
	int b = ip.nextInt();
	System.out.println("Enter the value of c: ");
	int c = ip.nextInt();
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(a>b);
	System.out.println(a<c);
	System.out.println(a<=b);
	System.out.println(a>=c);
	System.out.println(1==1.1);
	}

}
