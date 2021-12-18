package programs;
import java.util.Scanner;

public class Addonlyodddigitsinanumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number to add only odd digits of it: ");
		int num = ip.nextInt();
		int sum=0,rem;
		while(num!=0) {
			rem=num%10;
			if(rem%2!=0) {
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println("The sum of odd digits in a number is "+sum);
	}

}
