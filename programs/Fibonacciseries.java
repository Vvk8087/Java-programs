package programs;
import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number upto which fibonacci series you want:");
		int num = ip.nextInt();
		int a = 1;
		int b = 0;
		for(int i=1;i<=num;i++) {
			a=a+i;
		for(int j=1;j<=num;j++) {
			b=a;
		}
		System.out.println(b);
		}
		}
		

}
