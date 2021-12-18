package programs;
import java.util.Scanner;

public class Averagemarkscalulation {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("To check your percentage enter the marks of each subjects\n");
		System.out.println("Enter the marks for English: ");
		int a = ip.nextInt();
		System.out.println("Enter the marks for Maths: ");
		int b = ip.nextInt();
		System.out.println("Enter the marks for Science: ");
		int c = ip.nextInt();
		System.out.println("Enter the marks for History: ");
		int d = ip.nextInt();
		System.out.println("Enter the marks for Geography: ");
		int e = ip.nextInt();
		int add = a+b+c+d+e;
		float percentage = add/500f*100;
		System.out.println("Your final percntage is: "+(percentage)+" %");
		

	}

}
