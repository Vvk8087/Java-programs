package programs;
import java.util.Scanner;

public class Checkpalindromenumberornot {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number of which revere you want:");
		int num = ip.nextInt();
		int n1=num;
		int rem,rev=0;
		while(num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num = num/10;
		}
		System.out.println(rev);
		if(n1==rev) {
			System.out.println("Number is palidrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	

}
