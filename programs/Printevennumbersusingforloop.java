package programs;
import java.util.Scanner;

public class  Printevennumbersusingforloop {
	public static void main(String[]args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("How many even numbers you want: ");
		int num = ip.nextInt();
		for(int i=0;i<=num;i++) {
			System.out.println((2*i)); //use 2*i+1 for even numbers printing

		}
	}
}
