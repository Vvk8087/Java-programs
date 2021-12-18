package programs;
import java.util.Scanner;

public class Oddandevencheckfrom1to20usingforloop {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter a number upto which you want find even and odd numbers:");
	int num = ip.nextInt();
	for(int i=1;i<=num;i++) {
		if(i%2==0) {
			System.out.println("Even: "+i);
		}
		else {
			System.out.println("Odd: "+i);
		}
		}
	}

}