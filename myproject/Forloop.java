package myproject;
import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter a number upto which you want numbers to print:");
	int num = ip.nextInt();
	for(int i=0;i<=num;i++) {
		System.out.println(i);
	}
	}

}
