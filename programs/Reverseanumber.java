package programs;
import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number of which revere you want:");
		int num = ip.nextInt();
		int rem,rev=0;
		while(num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num = num/10;
		}
		System.out.println(rev);
	}

}
